package com.epam.tc.selenium.lesson5.page;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfNestedElementsLocatedBy;

import com.epam.tc.selenium.lesson5.page.component.ModalWindowComponent;
import com.epam.tc.selenium.lesson5.page.component.ProductCardComponent;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OzonCatalogItemPage extends AbstractBasePage {

    @FindBy(css = ".e2r5")
    private List<WebElement> products;

    public OzonCatalogItemPage(WebDriver driver) {
        super(driver);
    }

    public String addProductToCompare(int index) {
        wait.until(visibilityOfAllElements(products));
        return addProductToCompare(new ProductCardComponent(driver, products.get(index - 1)));
    }

    private String addProductToCompare(ProductCardComponent productCard) {
        productCard.clickToAddToCompareButton();
        return productCard.getProductName();
    }

    public void clickToNavigateToCompareButton() {
        new ModalWindowComponent(driver).clickToNavigateButton();
    }

    public List<String> getProductNames() {
        return wait.until(visibilityOfAllElements(products))
                   .stream()
                   .map(product -> new ProductCardComponent(driver, product))
                   .collect(Collectors.toList())
                   .stream()
                   .map(ProductCardComponent::getProductName)
                   .collect(Collectors.toList());
    }
}
