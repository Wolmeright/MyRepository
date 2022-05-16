package PageObject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForGit extends TestInit{
    @Test
    public void checkEatstreetSignIn() {
        HomePage homePage = new HomePage(driver);
        openSite("https://qa2.eatstreet.com/");
        homePage.buttonSignIn().click();
        homePage.enterEmail().sendKeys("thetallos7@gmail.com");
        homePage.enterPassword().sendKeys("EATstreet192837465a");
        homePage.buttonGotIt().click();
        homePage.acceptSighIn().click();
        sleep(3);

        Assert.assertTrue(homePage.myAccount().isDisplayed());
    }
}
