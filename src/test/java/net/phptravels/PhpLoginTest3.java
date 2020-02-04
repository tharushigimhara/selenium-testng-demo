package net.phptravels;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class PhpLoginTest3 {
    @BeforeMethod
    public void setUp() throws Exception {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();

    }

    @Test
    public void testName() throws Exception {

        LoginPage login =new LoginPage();
        login.loginas("admin@phptravels.com","demoadmin");
        HomePage homePage=new HomePage();
        homePage.selectAccounts();
        homePage.selectCustomer();
    }
}