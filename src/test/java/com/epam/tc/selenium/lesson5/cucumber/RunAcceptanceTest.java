package com.epam.tc.selenium.lesson5.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
public class RunAcceptanceTest extends AbstractTestNGCucumberTests {
}
