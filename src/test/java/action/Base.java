package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    public WebDriver driver = null;

    public WebDriver getDriver() {
        driver = new ChromeDriver();
        return driver;
    }


    public boolean typeTextBOX(By by, String input){
        boolean flag = false;
        try{
            driver.findElement(by).sendKeys(input);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean clickButtonandImplicitWait(By by){
        boolean flag = false;
        try{
            driver.findElement(by).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean clickButtonandExplicitWait(By by, int time){
        boolean flag = false;
        try{
            driver.findElement(by).click();
            Thread.sleep(time);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public void pActionStatus(boolean status, String action){
        if(status){
            System.out.println(action + " action completed...");
        }else{
            System.out.println(action + " not action completed...");
        }
    }




    /*
    public WebDriver getDriver() {

    ChromeOptions opt = new ChromeOptions();
    opt.addArguments("--headless");
    driver= new ChromeDriver(opt);
    return driver;
}
     */


}
