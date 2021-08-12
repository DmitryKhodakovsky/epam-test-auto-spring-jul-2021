package com.epam.tc.selenium.lesson5.cucumber.steps;

import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    @Given("I open Ozon Home page")
    public void openOzonHomePage() {
        homePage.open();
    }

    @Given("I open {string} subcategory in {string} category from catalog in header")
    public void openSubcategoryInCategoryFromCatalogInHeader(String subcategory, String category) {
        var catalog = homePage.openCatalog();
        catalog.openCategory(category);
        catalog.openSubcategory(subcategory);
    }
}
