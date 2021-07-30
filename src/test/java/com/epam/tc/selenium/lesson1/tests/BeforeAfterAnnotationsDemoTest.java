package com.epam.tc.selenium.lesson1.tests;

import com.epam.tc.selenium.lesson1.Tags;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Slf4j
public class BeforeAfterAnnotationsDemoTest {
    @BeforeMethod
    public void beforeMethod() {
        log.info("");
    }

    @AfterMethod
    public void afterMethod() {
        log.info("");
    }

    @AfterMethod(groups = {Tags.SMOKE})
    public void afterMethodSmokeGroup() {
        log.info("");
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        log.info("");
    }

    @AfterClass
    public void afterClass() {
        log.info("");
    }

    @BeforeSuite
    public void beforeSuite() {
        log.info("");
    }

    @AfterSuite
    public void afterSuite() {
        log.info("");
    }

    @BeforeTest
    public void beforeTest() {
        log.info("");
    }

    @AfterTest
    public void afterTest() {
        log.info("");
    }

    @Test
    public void testOrder1() {
        log.info("");
        Assertions.assertThat(false)
                  .isFalse();
    }

    @Test(groups = {Tags.SMOKE})
    public void testOrder2() {
        log.info("");
        Assertions.assertThat(true)
                  .isNotEqualTo(false);
    }
}
