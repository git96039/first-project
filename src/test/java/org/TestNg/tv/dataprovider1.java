package org.TestNg.tv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class dataprovider1 {
    @DataProvider
    public Object[][] gettestdata(){
        Object[][] data = new Object[4][2];
                data[0][0] = "uname1";
                data[0][1] = "pass1";
                data[1][0] = "uname2";
                data[1][1] = "pass2";
                data[2][0] = "uname3";
                data[2][1] = "pass3";
                data[3][0] = "uname4";
                data[3][1] = "pass4";
                return data;
    }


    @Test(dataProvider = "gettestdata" )
    public void fb1(String uname1, String password1) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kalyan/Desktop/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.findElement(By.id("email")).sendKeys(uname1);
        driver.findElement(By.id("pass")).sendKeys(password1);
    }
}
