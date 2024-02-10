package test1_Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @AfterTest
    public void quitbrowser(){
        driver.quit();
    }

    @Parameters("url")
    @BeforeClass
    public void launchBrowser(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    public void Login() throws InterruptedException {
        WebElement ele;
        ele = driver.findElement(By.xpath("//div[@class='flex justify-between']/div/button"));
        //ele.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("wilfredotest@test.com");
        driver.findElement(By.xpath("//input[@id='outlined-adornment-password']")).sendKeys("test123");
        driver.findElement(By.xpath("//button[@aria-label='toggle password visibility']")).click();
        Thread.sleep(3000);
        System.out.println("Login page .....");
    }

}
