package com.eviltester.webdriver;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inputy {
    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.gecko.driver","gecko/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Path sampleFile = Paths.get("http://localhost:8080/body.samolot.html");
        driver.get("http://localhost:8080/inputy.html");
        driver.findElement(By.cssSelector(".input1")).sendKeys("3");
        driver.findElement(By.cssSelector(".input2")).sendKeys("5");

        driver.findElement(By.cssSelector(".sum1")).click();
Assert.assertEquals("8",driver.findElement(By.cssSelector("#add")).getText());


        driver.close();
    }
}
