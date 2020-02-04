package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;
import utils.TestApp;

public class PhpTravelsLoginTest2 {
    PropertyFileReader prop=new PropertyFileReader();
    String url=prop.getProperty("config","url");
    String  chrompath=prop.getProperty("config","chrome.path");
    WebDriver driver;


    @BeforeMethod
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver",chrompath);
        this.driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }


    @Test
    public void testLogin() throws Exception {
        Login login= new Login();
        login.loginas(driver,"admin@phptravels.com","demoadmin");

        waitForNextElement(By.linkText("ACCOUNTS"),20);

        Home home=new Home();
        home.selectAccounts(driver);

        waitForNextElement(By.linkText("CUSTOMERS"),20);

        home.selectCustomer(driver);



    }

    private WebElement waitForNextElement(By locater,int timeOut){

        WebElement element=new WebDriverWait(driver,timeOut).until(ExpectedConditions.presenceOfElementLocated(locater));
        return element;

    }

    @Test
    public void testLogin2() throws Exception {
        TestApp.getInstance().openBrowser();
    }
}