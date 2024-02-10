package dockerEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetStarted {

    WebDriver driver;
    By getStarteButton = By.xpath("(//a[text()='Get Started'])[1]");
    By getStartedBanner = By.xpath("//h1[text()='Get Started with Docker']");
    By learnHowButton = By.xpath("//a[@id='dkr_gs_learn_how_01']");
    By downloadButton = By.xpath("//div[@class='os-download']/div/div/a");

    @Parameters("url")
    @BeforeClass
    public void runBrowser(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterTest
    public void quitbrowser() {
        driver.quit();
    }

    @Test(priority = 0)
    public void GetStartedButtonTest(){
        driver.findElement(getStarteButton).click();
    }

    @Test(priority = 1)
    public void bannerTest(){
        if (driver.findElement(getStartedBanner).getText().equals("Get Started with Docker")) {
            System.out.println("Get Started In Banner is present on Get Started Page...");
        }else {
            System.out.println("Get Started In Banner is not present on Get Started Page...");
        }
    }

    @Test(priority = 2)
    public void learnHowButtonValidation(){
        if (driver.findElement(learnHowButton).isDisplayed()) {
            System.out.println("Learn how to install button is present on Get Started Page...");
        }else {
            System.out.println("Learn how to install button is not present on Get Started Page...");
        }
    }

    @Test(priority = 3)
    public void downloadButtonValidation(){
        if (driver.findElement(downloadButton).isDisplayed()) {
            System.out.println("Download button is present on Get Started Page...");
        }else {
            System.out.println("Download button is not present on Get Started Page...");
        }
    }

}

