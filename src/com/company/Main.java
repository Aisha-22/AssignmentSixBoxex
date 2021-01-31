package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Setting System Property for the Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aisha Hlatshwayo\\Desktop\\chromedriver.exe");
        //Creating a driver object for the Browser
        WebDriver driver = new ChromeDriver();

        //Implicit Wait Machine - When your code/test executes faster than your browser, test works with elements that are not there.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	// 1. select any check box,
        driver.findElement(By.id("checkBoxOption2")).click();
        //2. grab the label of the selected check box
        Thread.sleep(3000);
        String getText = driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getAttribute("Option2");
        System.out.println(getText);
        //3. select an option in drop down, here you select should come from option 2
        WebElement element = driver.findElement(By.id("dropdown-class-example"));
        Select s = new Select(element);
        s.selectByVisibleText("Option2");
        //4. enter step to grab label text in edit box
        //5. Click alert and then verify if text grabbed from 2 is present in the pop up massage
    }
}
