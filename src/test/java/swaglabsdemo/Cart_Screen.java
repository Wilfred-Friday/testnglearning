package swaglabsdemo;

import org.openqa.selenium.By;

public class Cart_Screen {


    public By pShopCart(){
        return By.xpath("//span[@class='title']");
    }

    public By pRemove_Bttn(){
        return By.id("remove-sauce-labs-backpack");
    }

    public By pCheckoutBttn(){
        return By.id("checkout");
    }
}
