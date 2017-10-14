package com.eviltester.webdriver;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest3 {
    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.gecko.driver","gecko/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Path sampleFile = Paths.get("http://localhost:8080/body.samolot.html");
        driver.get("http://localhost:8080/body.samolot.html");
        Assert.assertEquals("ml",driver.findElement(By.cssSelector("[dupa='ml']")).getText());
        Assert.assertEquals("idik",driver.findElement(By.cssSelector("#regId")).getText());
        Assert.assertEquals("jambojet",driver.findElement(By.cssSelector(".jambojet")).getText());
        Assert.assertEquals("auto",driver.findElement(By.cssSelector(".samolot")).getText());
        Assert.assertEquals("Span3",driver.findElement (By.cssSelector("[title='black']")).getText());
        Assert.assertEquals("Marcin","Marcin");
        Assert.assertEquals("Marcin","Marcin2");
        //driver.findElement(By.cssSelector(".samolot")).getText();
        driver.close();
    }
}
