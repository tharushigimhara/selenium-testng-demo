package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Login {

    public void loginas(WebDriver driver,String userName, String password) {


        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("demoadmin");
        driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
       // driver.findElement(By.className("ladda-label")).click();
        List<WebElement> button=driver.findElements(By.className("btn-primary"));
        button.get(1).click();

    }

}
