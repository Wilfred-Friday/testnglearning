package swaglabsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_Page {

    WebDriver driver;
    public By pValidationScreen(){
        return By.xpath("//span[text()='Products']");
    }

    public By pProduct1(){
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    public By pProduct2(){
        return By.id("add-to-cart-sauce-labs-bike-light");
    }

    public By pShopCart(){
        return By.id("shopping_cart_container");
    }








}
