package swaglabsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {


   WebDriver driver;

    public By pUserName(){
        return By.id("user-name");
    }

    public By pPsswrd(){
        return By.id("password");
    }

    public By pLoginButton(){
        return By.id("login-button");
    }


}
