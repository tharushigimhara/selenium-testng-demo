package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TestApp;

import java.util.List;

public class LoginPage {

    WebDriver driver= TestApp.getInstance().getDriver();

    public void loginas(String userName, String password) {


        TestApp.getInstance().waitForElement(By.name("email"),20);

        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
        driver.findElement(By.name("email")).sendKeys(userName);
        //driver.findElement(By.className("ladda-label")).click();
        List<WebElement> button = driver.findElements(By.className("btn-primary"));
        button.get(1).click();

    }
}
