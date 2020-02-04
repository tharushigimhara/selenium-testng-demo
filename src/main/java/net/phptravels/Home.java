package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    public void selectAccounts(WebDriver driver){
        driver.findElement(By.linkText("ACCOUNTS")).click();


    }

    public void selectCustomer(WebDriver driver){

        driver.findElement(By.linkText("CUSTOMERS")).click();

    }
}