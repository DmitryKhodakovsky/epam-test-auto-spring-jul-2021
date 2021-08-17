package com.epam.tc.selenium.lesson6.page;

import org.openqa.selenium.WebDriver;

public class OzonHomePage extends AbstractBasePage {

    public OzonHomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open("");
    }
}
