package com.luxequality.selenium.helper;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks extends CommonMethods {

    @BeforeClass
    public void SetUp() {
        runBrowser();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
