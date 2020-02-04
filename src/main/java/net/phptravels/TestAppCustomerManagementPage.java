package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppCustomerManagementPage {
    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader prop= new PropertyFileReader();
    String addButtonElement=prop.getProperty("TestAppCustomerManagementPage","add.button.element");

    public TestAppCustomerCreationPage addCustomer(){
        TestApp.getInstance().waitForElement(By.xpath(addButtonElement),20);
        driver.findElement(By.xpath(addButtonElement)).click();
        return new TestAppCustomerCreationPage();
    }



}