package dockerEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hompage {

    WebDriver driver;
   By logo = By.xpath("//li[@class='logo']");


   @Test
    public void logoValidation(){
       if (driver.findElement(logo).isDisplayed()) {
           System.out.println("docker logo is present...");
       }
   }

   @Parameters("url")
   @BeforeClass
    public void runBrowser(String url){
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(url);
   }

    @AfterTest
    public void quitbrowser(){
        driver.quit();
    }
}
