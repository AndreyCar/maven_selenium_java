package com.luxequality.selenium;

import org.testng.annotations.Test;

import com.luxequality.selenium.constants.TestUsers;
import com.luxequality.selenium.helper.Hooks;

public class Login extends Hooks {

    @Test
    public void LoginToWebsite() {
        // open the Login page
        loginPage.open();

        // enter a valid username and password and click the Login button
        loginPage.login(TestUsers.standardUser, TestUsers.password);

        // wait for the sidebar of the Inventory page,
        // which means that we have successfully logged in
        waitForVisibility(inventoryPage.btnExtendSidebarMenu());
    }
}
