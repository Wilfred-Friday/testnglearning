package SauceTest;
import action.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import swaglabsdemo.*;

public class Test_POM extends Base {
    private WebDriver driver;
    Cart_Screen cs;
    Checkout_Information ci;
    Checkout_Overview co;
    Login lo;
    Product_Page pp;

    @Parameters("url")
    @BeforeClass
    public void runBrowser(String url) {
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get(url);
         cs = new Cart_Screen();
         ci = new Checkout_Information();
         co = new Checkout_Overview();
         lo = new Login();
         pp = new Product_Page();
    }

    @AfterClass
    public void quitbrowser() {
        driver.quit();
    }

    @Test
    public void pPurchaseFlowTest(){
        //Login
        typeTextBOX(lo.pUserName(),"standard_user");
        typeTextBOX(lo.pPsswrd(),"secret_sauce");
        clickButtonandImplicitWait(lo.pLoginButton());

        //Product info
        clickButtonandImplicitWait(pp.pProduct1());
        clickButtonandImplicitWait(pp.pProduct2());
        clickButtonandImplicitWait(pp.pShopCart());

        //Cart
        clickButtonandImplicitWait(cs.pRemove_Bttn());
        clickButtonandImplicitWait(cs.pCheckoutBttn());

        //Checkout information
        typeTextBOX(ci.pFirstName(),"asd");
        typeTextBOX(ci.pLastName(),"qwe");
        typeTextBOX(ci.pPostalCode(),"12312");
        clickButtonandExplicitWait(ci.pContinueBttn(),10);

        //Checkout Overview
        clickButtonandImplicitWait(co.pFinish());
    }



}
