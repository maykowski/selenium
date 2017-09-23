package com.eviltester.webdriver;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFirstTest2 {
    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.gecko.driver","gecko/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Path sampleFile = Paths.get("C:\\Users\\User\\Desktop\\HTML\\body.samolot.html");
        driver.get("http://localhost:8080/body.samolot.html");
        //driver.get("file:///C:/Users/User/Desktop/HTML/body.samolot.html");
        Assert.assertEquals("samolot",driver.findElement(By.cssSelector(".samolot")).getText());
        //driver.findElement(By.cssSelector(".samolot")).getText();
        driver.close();
    }
}
