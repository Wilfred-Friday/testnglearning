package swaglabsdemo;

import org.openqa.selenium.By;

public class Checkout_Overview {
    public By pScreenValidation(){
        return By.xpath("//span[@class='title']");
    }
    public By pFinish(){
        return By.id("finish");
    }

}
