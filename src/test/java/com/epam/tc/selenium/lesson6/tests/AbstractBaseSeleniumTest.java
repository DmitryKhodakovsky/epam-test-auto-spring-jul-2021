package com.epam.tc.selenium.lesson6.tests;

import com.epam.tc.selenium.lesson6.driver.WebDriverSingleton;
import com.epam.tc.selenium.lesson6.steps.ActionStep;
import com.epam.tc.selenium.lesson6.steps.AssertionStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractBaseSeleniumTest {

    ActionStep actionStep;
    AssertionStep assertionStep;

    @BeforeMethod
    public void setUp(ITestContext testContext) {
        var driver = WebDriverSingleton.getDriver();

        driver.manage().window().maximize();

        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);
        testContext.setAttribute("driver", driver);
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSingleton.closeDriver();
    }
}
