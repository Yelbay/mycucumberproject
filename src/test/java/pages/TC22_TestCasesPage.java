package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.*;

public class TC22_TestCasesPage {

    public TC22_TestCasesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement recommendedItems;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[74]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//div[@id='cart_info']//tbody//tr")
    public WebElement cartPage;

    @FindBy(xpath = "//h4//a" )
    public WebElement SummerWhiteTop;

}

