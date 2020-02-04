package net.phptravels;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class PhpLoginTest4 {


    @BeforeMethod
    public void setUp() throws Exception {

        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();

    }

    @Test
    public void testLogin() throws Exception {

        TestAppLoginPage loginPage=new TestAppLoginPage();
        loginPage
                .loginSuccess("admin@phptravels.com","demoadmin")
                .selectAccounts()
                .selectCustomer()
                .addCustomer()
                .setFirstName("Training")
                .setLastName("partner")
                .setEmail("training123@gmail.com")
                .setPassword("1234")
                .setMobile("0773990002")
                .setCountry("Sri Lanka")
                .setAddres1("mirissa");
    }
}