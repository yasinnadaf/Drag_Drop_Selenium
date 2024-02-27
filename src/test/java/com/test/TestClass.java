package com.test;

import com.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
    @BeforeTest
    public void init(){
        initialization();
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        WebElement dragElement = driver.findElement(By.id("draggable"));
        Actions action = new Actions(driver);
        WebElement drop = driver.findElement(By.id("droppable"));
        action.dragAndDrop(dragElement, drop).perform();
        Thread.sleep(200);
    }

    @AfterTest
    public void closingWind(){
        closeWindow();
    }
}
