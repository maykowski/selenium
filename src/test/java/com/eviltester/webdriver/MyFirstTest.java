package com.eviltester.webdriver;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.gecko.driver","gecko/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://onet.pl");
        driver.findElement(By.cssSelector("li.mail a")).click();
    }
}
