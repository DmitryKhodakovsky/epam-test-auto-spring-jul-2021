package com.epam.tc.selenium.lesson4.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StepsDemo {

    @BeforeMethod
    public void setupNameless() {
        //nop
    }

    @BeforeMethod(description = "Setting up test env")
    public void setupName() {
        step("setup name step");
    }

    @Test
    public void testWithoutTestNameThatTakesNameFromMethod() {
    }

    @Test(description = "This is test name @Test")
    @Description("This is test description @Description")
    public void testWithDescriptionAnnotation() {
        step("nop");
    }
}
