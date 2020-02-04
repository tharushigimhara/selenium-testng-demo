package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PhpTravelsLoginTest {
    public static void main(String[] args)  {

        /*
        1.set the chromdriver
         */
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");


        WebDriver driver=new ChromeDriver();

        /*
        2.go to the php travel website login  page
         */
        driver.get("https://www.phptravels.net/admin");
        driver.manage().window().maximize();

        //WebElement userName=driver.findElement(By.name("email"));
        //userName.sendKeys("admin@phptravels.com");
        /*
        3.set the username in login page
         */
        driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");

        //driver.findElements(By.name("email")).clear();
        /*
        4.set password in login page
           */
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("demoadmin");
//        driver.findElement(By.className("ladda-label")).click();


        /*
        5.get the list of buttons those have class name btn-primary
         */
        List<WebElement>button=driver.findElements(By.className("btn-primary"));
        /*
        6.click the login button
         */
        button.get(1).click();


        /*
        7.add 3 seconds waits and load next page
         */
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*
        8.click accounts link
         */
        driver.findElement(By.linkText("ACCOUNTS")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.linkText("CUSTOMERS")).click();
        driver.findElement(By.xpath("//*[@type='submit']"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.name("fname")).sendKeys("Tharushi");
        driver.findElement(By.name("lname")).sendKeys("Gimhara");
        driver.findElement(By.name("email")).sendKeys("tharushi123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.name("mobile")).sendKeys("0767622945");
        driver.findElement(By.name("address1")).sendKeys("Udupila,Mirissa");
        driver.findElement(By.name("address2")).sendKeys("Matara");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Select dropdownCountry= new Select(driver.findElement(By.name("country")));
        /*dropdownCountry.selectByVisibleText("Australia");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        dropdownCountry.selectByValue("AZ");


        //dropdownCountry.selectByIndex(5);
        Select dropdownStatus=new Select(driver.findElement(By.name("status")));
        dropdownStatus.selectByValue("no");



    }
}