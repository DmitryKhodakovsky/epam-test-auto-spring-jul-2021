package com.epam.tc.selenium.lesson5.cucumber.steps;

import com.epam.tc.selenium.lesson5.cucumber.context.TestContext;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ActionStep extends AbstractStep {

    @ParameterType("'(.+)'")
    public List<Integer> productIndexes(String indexes) {
        return Arrays.stream(indexes.split(","))
                     .map(index -> Integer.parseInt(index.trim()))
                     .collect(Collectors.toList());
    }

    @When("I add products {productIndexes} to the Compare list on Catalog Item page")
    public void addProductsToCompareListOnCatalogItemPage(List<Integer> productIndexes) {
        List<String> productNames = new ArrayList<>();

        for (Integer productIndex : productIndexes) {
            productNames.add(catalogItemPage.addProductToCompare(productIndex));
        }

        TestContext.getInstance().addTestObject("compare_product_list", productNames);
        catalogItemPage.clickToNavigateToCompareButton();
    }
}
