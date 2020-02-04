package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppCustomerCreationPage {


    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader prop=new PropertyFileReader();
    String firstNameElement=prop.getProperty("TestAppCustomerCreationPage","first.name.element");
    String lastNameElement=prop.getProperty("TestAppCustomerCreationPage","last.name.element");
    String emailElement=prop.getProperty("TestAppCustomerCreationPage","email.Element");
    String passwordElement=prop.getProperty("TestAppCustomerCreationPage","password.element");
    String mobileElement=prop.getProperty("TestAppCustomerCreationPage","mobile.element");
    String countryElement=prop.getProperty("TestAppCustomerCreationPage","country.element");
    String address1Element=prop.getProperty("TestAppCustomerCreationPage","address1.element");
    String address2Element=prop.getProperty("TestAppCustomerCreationPage","address2.element");


    public TestAppCustomerCreationPage setFirstName(String firstName){
        driver.findElement(By.name(firstNameElement)).sendKeys("fname");
        return this;

    }
    public TestAppCustomerCreationPage setLastName(String lastName){

        driver.findElement(By.name(lastNameElement)).sendKeys("lname");
        return this;
    }
    public TestAppCustomerCreationPage setEmail(String email){
        driver.findElement(By.name(emailElement)).sendKeys("email");
        return this;
    }
    public TestAppCustomerCreationPage setPassword(String password){
        driver.findElement(By.name(passwordElement)).sendKeys("password");
        return this;
    }

    public TestAppCustomerCreationPage setMobile(String password){
        driver.findElement(By.name(mobileElement)).sendKeys("mobile");
        return this;
    }

    public TestAppCustomerCreationPage setCountry(String country){
        TestApp.getInstance().waitForElement(By.name(countryElement),20);
        Select dropdownStatus=new Select(driver.findElement(By.name(countryElement)));
        dropdownStatus.selectByVisibleText(country);
        return this;
    }
    public TestAppCustomerCreationPage setAddres1(String address1){
        driver.findElement(By.name(address1Element)).sendKeys("address1");
        return this;
    }

    public TestAppCustomerCreationPage setAddres2(String address2){
        driver.findElement(By.name(address2Element)).sendKeys("address2");
        return this;
    }




}
