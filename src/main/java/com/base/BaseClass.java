package com.base;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public WebDriver driver;

    public void initialization(){
        ChromeDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
    }

    public void closeWindow(){
        driver.close();
    }
}
