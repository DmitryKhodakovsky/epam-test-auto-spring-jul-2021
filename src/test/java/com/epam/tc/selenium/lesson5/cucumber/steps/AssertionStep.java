package com.epam.tc.selenium.lesson5.cucumber.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.selenium.lesson5.cucumber.context.TestContext;
import io.cucumber.java.en.Then;
import java.util.List;

public class AssertionStep extends AbstractStep {

    @Then("all selected products should be visible on Compare Products page")
    public void allSelectedProductsShouldBeVisibleOnCompareProductsPage() {
        var actualProductNames = comparePage.getProductNames();
        List<String> expectedProductNames = TestContext.getInstance().getTestObject("compare_product_list");

        assertThat(actualProductNames)
            .as("Not all product was displayed on compare product page")
            .containsExactlyInAnyOrderElementsOf(expectedProductNames);
    }
}
