package test1_Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_one {

    WebDriver driver;

    @Test
    public void devlabMenuvalidation() throws InterruptedException {
        WebElement ele;
        Actions action = new Actions(driver);
        ele = driver.findElement(By.xpath("//span[text()='Courses']"));

        // Mouse Hover into Courses Menu bar ...
        if(ele.isDisplayed()){
            System.out.println("The DevLab Courses Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Consulting Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Consulting']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Consulting Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Enterprises Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Enterprises']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Enterprises Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Certification Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Certification']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Certification Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Resources Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Resources']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Resources Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }

    }

    @Test
    public void devlabfootervalidation() throws InterruptedException {
        System.out.println("Maven project");
        WebElement ele;
        ele = driver.findElement(By.xpath("//button[text()='Resources']"));
        if(ele.isDisplayed()) {
            System.out.println("The DevLab Resources Menu Bar is present ......");
            Thread.sleep(3000);
        }

    }


    @Parameters("url")
    @BeforeClass
    public void launchBrowser(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
}

    @AfterTest
    public void quitbrowser(){
        driver.quit();
}
}
