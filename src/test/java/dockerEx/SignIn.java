package dockerEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignIn {

    WebDriver driver;

    By signInButton = By.xpath("(//a[text()='Sign In'])[1]");
    By logoSignIn = By.xpath("//img[@id='prompt-logo-center']");
    By signInBanner = By.xpath("//h1[text()='Sign in']");
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

    @Test(priority = 0)
    public void signInTestLogo(){
        driver.findElement(signInButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.presenceOfElementLocated(logoSignIn));
            if (logo.isDisplayed()) {
                System.out.println("Docker logo is present on sign in Page...");
            }else {
                System.out.println("Docker logo is not present on the sign in Page...");
            }


    }

    @Test(priority = 1)
    public void signInTestBanner(){
        if (driver.findElement(signInBanner).getText().equals("Sign in")) {
            System.out.println("Sign In Banner is present on sign in Page...");
        }
    }



}
