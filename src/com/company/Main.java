package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        //Setting System Property for the Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        //Creating a driver object for the Browser
        WebDriver driver = new ChromeDriver();

        //Implicit Wait Machine - When your code/test executes faster than your browser, test works with elements that are not there.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	// 1. select any check box,
        driver.findElement(By.id("checkBoxOption2")).click();
        //2. grab the label of the selected check box
        while (!driver.findElement(By.cssSelector("#checkBoxOption2")).getText().contains("option2"))
        {
            //Returns a boolean issue
            driver.findElement(By.cssSelector("#checkBoxOption2")).click();
        }//wh
        //3. select an option in drop down, here you select should come from option 2
        //4. enter step to grab label text in edit box
        //5. Click alert and then verify if text grabbed from 2 is present in the pop up massage
    }
}
