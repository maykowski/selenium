package com.eviltester.webdriver;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inputy {
    @Test
    public void startWebDriver() {
        System.setProperty("webdriver.gecko.driver", "gecko/geckodriver.exe");// nie wiem co to robi ale to ma tu być i uj..
        WebDriver driver = new FirefoxDriver();// To jest jakiś driver żeby działało we Firefoxie
        //Path sampleFile = Paths.get("http://localhost:8080/body.samolot.html");
        driver.get("http://localhost:8080/inputy.html"); //to jest "przenieś mnie do pod ten adres http"
        driver.findElement(By.cssSelector(".input1")).sendKeys("3"); //porównuję tu klasę input1 z kluczem którym jest string"3"
        driver.findElement(By.cssSelector(".input2")).sendKeys("5"); //porównuję tu klasę input1 z kluczem którym jest string"5"

        driver.findElement(By.cssSelector(".sum1")).click(); //to jest "kliknij w button o klasie sum1"
        Assert.assertEquals("8", driver.findElement(By.cssSelector("#add")).getText()); //tu porównuję wartośc "8" z tym co jest pod elementem czyli selektorem id i jego tekstem

        driver.findElement(By.cssSelector(".inputFirstname")).sendKeys("Marcin");
        driver.findElement(By.cssSelector(".inputLastname")).sendKeys("Maykowski");
        driver.findElement(By.cssSelector(".inputAddress")).sendKeys("Osiedle Akademickie");


        driver.close();// tu zamykam przeglądarkę

    }
}
