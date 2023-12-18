package com.luxequality.selenium.helper;

import com.luxequality.selenium.pages.LoginPage;
import com.luxequality.selenium.pages.InventoryPage;

public class PageInitializer {
    public LoginPage loginPage;
    public InventoryPage inventoryPage;

    /**
     * Initialize pages
     */
    public void initializer() {
        loginPage = new LoginPage();
        inventoryPage = new InventoryPage();

    }
}