package com.epam.tc.selenium.lesson5.cucumber.steps;

import com.epam.tc.selenium.lesson5.cucumber.context.TestContext;
import com.epam.tc.selenium.lesson5.page.OzonCatalogItemPage;
import com.epam.tc.selenium.lesson5.page.OzonComparePage;
import com.epam.tc.selenium.lesson5.page.OzonHomePage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected OzonHomePage homePage;
    protected OzonCatalogItemPage catalogItemPage;
    protected OzonComparePage comparePage;

    public AbstractStep() {
        WebDriver driver = TestContext.getInstance().getTestObject("web_driver");

        homePage = new OzonHomePage(driver);
        catalogItemPage = new OzonCatalogItemPage(driver);
        comparePage = new OzonComparePage(driver);
    }
}
