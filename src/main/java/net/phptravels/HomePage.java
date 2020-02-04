package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class HomePage {

    WebDriver driver= TestApp.getInstance().getDriver();

    public void selectAccounts(){
        TestApp.getInstance().waitForElement(By.linkText("ACCOUNTS"),20);
        driver.findElement(By.linkText("ACCOUNTS")).click();


    }

    public void selectCustomer(){

        TestApp.getInstance().waitForElement(By.linkText("CUSTOMERS"),20);
        driver.findElement(By.linkText("CUSTOMERS")).click();

    }
}