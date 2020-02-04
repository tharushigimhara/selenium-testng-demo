package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppHomePage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader prop=new PropertyFileReader();

    String accountsElement=prop.getProperty("TestAppHomePage","accounts.menu.element");
    String customerElement=prop.getProperty("TestAppHomePage","customer.menu.element");


    public TestAppHomePage selectAccounts(){
        TestApp.getInstance().waitForElement(By.linkText(accountsElement),20);
        driver.findElement(By.linkText(accountsElement)).click();
        return this;


    }

    public TestAppCustomerManagementPage selectCustomer(){

        TestApp.getInstance().waitForElement(By.linkText(customerElement),20);
        driver.findElement(By.linkText(customerElement)).click();
        return new TestAppCustomerManagementPage();

    }

}