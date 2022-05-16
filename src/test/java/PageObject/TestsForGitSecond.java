package PageObject;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestsForGitSecond extends TestInit {
    @Test
    public void becomeDriver() {
        HomePage homePage = new HomePage(driver);
        openSite("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.buttonSignIn().click();
        homePage.enterEmail().sendKeys("thetallos7@gmail.com");
        homePage.enterPassword().sendKeys("EATstreet192837465a");
        homePage.acceptSighIn().click();
        sleep(5);
        homePage.becomeDriverApplyNow().click();
        sleep(5);
        homePage.applyInYourCity().click();
        sleep(5);
        homePage.takeLawrenceFromList().click();
        sleep(5);
        homePage.lawrenceDeliveryApply().click();
        sleep(6);
        Set<String> chromeWindows = driver.getWindowHandles();
        List<String> chromeWindowsList = new ArrayList<String>(chromeWindows);
        driver.switchTo().window(chromeWindowsList.get(1));

        Assert.assertTrue(homePage.submitButton().isDisplayed());
    }
    @Test
    public void clickDeliveryHustonAsian() {
        HomePage homePage = new HomePage(driver);
        openSite("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.buttonSignIn().click();
        homePage.enterEmail().sendKeys("thetallos7@gmail.com");
        homePage.enterPassword().sendKeys("EATstreet192837465a");
        homePage.acceptSighIn().click();
        sleep(3);
        homePage.takeHustonTX().click();
        sleep(3);
        homePage.takeAsianFood().click();
        sleep(3);
        homePage.categorySelectJapanesFood().click();
        sleep(3);
        homePage.takeAsianChefRestaurant().click();
        sleep(3);

        Assert.assertTrue(homePage.takeOut().isDisplayed());
    }
    @Test
    public void addNewAddressToMyAccount() {
        HomePage homePage = new HomePage(driver);
        openSite("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.buttonSignIn().click();
        homePage.enterEmail().sendKeys("thetallos7@gmail.com");
        homePage.enterPassword().sendKeys("EATstreet192837465a");
        homePage.acceptSighIn().click();
        sleep(5);
        homePage.buttonMyAccount().click();
        sleep(3);
        homePage.addNewAdressButton().click();
        sleep(3);
        homePage.streetAddressString().sendKeys("Homer Simpson avenue");
        homePage.apt_suiteString().sendKeys("24/24");
        homePage.cityString().sendKeys("Springfield");
        homePage.stateString().sendKeys("Our State");
        homePage.zipString().sendKeys("43024");
        homePage.addressLabelString().sendKeys("//input[@name='name']");
        homePage.newAddressSaveButton().sendKeys(Keys.ENTER);
    }
    @Test
    public void eatstreetChefRestourantTest() {
        HomePage homePage = new HomePage(driver);
        openSite("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.buttonSignIn().click();
        homePage.enterEmail().sendKeys("thetallos7@gmail.com");
        homePage.enterPassword().sendKeys("EATstreet192837465a");
        homePage.acceptSighIn().click();
        sleep(5);
        homePage.buttonMyAccount().click();
        sleep(3);
        homePage.enterYourAddressString().sendKeys("Huston");
        homePage.enterYourAddressString().sendKeys(Keys.ENTER);
        sleep(4);
        homePage.select4stars().click();
        homePage.selectCategoriesChineseFood().click();
        homePage.selectTheChefRestaurant().click();
        sleep(3);

        Assert.assertTrue(homePage.menuButton().isDisplayed());
    }
}
