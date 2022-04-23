package org.TestNg.tv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class tv {

    @BeforeMethod
    public void D1() {
        System.out.println("d1");
    }
        @AfterMethod
        public void D2() {
            System.out.println("d2");
        }
    @BeforeClass
    public void C1() {
        System.out.println("c1");
    }
        @AfterClass
        public void C2() {
            System.out.println("c2");
        }
    @BeforeTest
    public void B1() {
        System.out.println("b1");
    }
    @AfterTest
    public void B2() {
        System.out.println("b2");
    }
    @BeforeSuite
    public void A1() {
        System.out.println("a1");
    }
    @AfterSuite
    public void A2() {
        System.out.println("a2");
    }
    @Test
    public void bike2() {
        System.out.println("vamsi2");
    }



    @Test
    public void phone2() {
        System.out.println("prasad2");
    }
    @Test(enabled = false)
    public void bar(){
        System.out.println("kal2");
    }

}
