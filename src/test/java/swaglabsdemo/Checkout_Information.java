package swaglabsdemo;

import org.openqa.selenium.By;

public class Checkout_Information {

    public By pScreenValidation(){
        return By.xpath("//span[@class='title']");
    }
    public By pFirstName(){
        return By.id("first-name");
    }
    public By pLastName(){
        return By.id("last-name");
    }
    public By pPostalCode(){
        return By.id("postal-code");
    }
    public By pContinueBttn(){
        return By.id("continue");
    }
}
