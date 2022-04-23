package org.TestNg.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class home {
    @Test(enabled = false)
    public void home1() {
        System.out.println("kalyan1");
    }

    @Test(enabled = false)
    public void bike1() {
        System.out.println("vamsi1");
    }

    @Test(enabled = false)
    public void phone1() {
        System.out.println("prasad1");
    }


    @Test
    public void fb1() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kalyan/Desktop/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        /*driver.findElement(By.id("email")).sendKeys("jhd");
        driver.findElement(By.id("pass")).sendKeys("hch");*/
    }
@Test
    public void fb2() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kalyan/Desktop/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.findElement(By.id("email")).sendKeys("jhd");
        driver.findElement(By.id("pass")).sendKeys("hch");
    }
}
