package com.example.thithu3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangKiSelenium {

    ChromeDriver chromeDriver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");
    }

    @Test
    public void testDangKy() {

        WebElement inputName = chromeDriver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("March Nguyen");

        WebElement inputPhone = chromeDriver.findElement(By.xpath("//input[@id='phone']"));
        inputPhone.sendKeys("0123456789");

        WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("chucbeonhutruong");

        WebElement inputPass = chromeDriver.findElement(By.xpath("//input[@id='pass-regis']"));
        inputPass.sendKeys("123456");

        WebElement inputConfirmPass = chromeDriver.findElement(By.xpath("//input[@id='pass-confirm']"));
        inputConfirmPass.sendKeys("123456");

        WebElement submitButton = chromeDriver.findElement(By.xpath("//a[@id='register-btn']"));
        submitButton.click();
    }

    @AfterEach
    public void tearDown() {
        chromeDriver.quit();
    }
}
