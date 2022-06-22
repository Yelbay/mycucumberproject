package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.TC22_TestCasesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC22_TestCasesStepDefs {
    TC22_TestCasesPage tc22_testCasesPage=new TC22_TestCasesPage();

    @Given("launches the browser")
    public void launches_the_browser() {
        Driver.getDriver();
    }
    @When("navigate the URL")
    public void navigate_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
    }
    @Then("user Scroll to bottom of page")
    public void user_scroll_to_bottom_of_page() throws InterruptedException {
        Driver.executeJScommand(tc22_testCasesPage.recommendedItems,"arguments[0].scrollIntoView(true)");
        //   Thread.sleep(1000);
    }

    @Then("user verifies RECOMMENDED ITEMS are visible")
    public void user_verifies_recommended_items_are_visible() throws InterruptedException {
        Assert.assertTrue(tc22_testCasesPage.recommendedItems.isDisplayed());
        //   Thread.sleep(1000);

    }

    @Then("user click on Add to Cart on Recommended product")
    public void user_click_on_add_to_cart_on_recommended_product() {
        tc22_testCasesPage.addToCartButton.click();
    }

    @Then("user click on View Cart button")
    public void user_click_on_view_cart_button() throws InterruptedException {
        ReusableMethods.waitFor(2);
        tc22_testCasesPage.viewCartButton.click();


    }

    @Then("user Verify that products is displayed in cart page")
    public void user_verify_that_products_is_displayed_in_cart_page() {
        Assert.assertTrue(tc22_testCasesPage.cartPage.isDisplayed());
        Assert.assertEquals("Summer White Top",tc22_testCasesPage.SummerWhiteTop.getText());

    }
    @Then("closes the browser")
    public void closes_the_browser() {
        Driver.closeDriver();

    }
}
