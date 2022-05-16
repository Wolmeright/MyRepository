package PageObject;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestsEatstreetAndOther extends TestInit {

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
    public void newTests() {
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
    @Test
    public void checkEbayLogInAndHat() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.ebay.com/");
        homePage.ebaySighInButton().click();
        sleep(3);
        homePage.emailOrUsernameString().sendKeys("Thetallos7@gmail.com");
        homePage.continueSighInButton().click();
        sleep(3);
        homePage.ebayPasswordString().sendKeys("EBAY192837465a");
        homePage.ebaySighInConntinueButton().sendKeys(Keys.ENTER);
        homePage.searchForEnythingString().sendKeys("Covboy hat");
        homePage.searchForEnythingString().sendKeys(Keys.ENTER);
        homePage.minValueIn$String().sendKeys("99");
        homePage.maxValueIn$String().sendKeys("99");
        homePage.submitPriceRangeButton().click();
        homePage.buyItNowFilter().click();
    }
    @Test
    public void checkEbayGuitarsLesPaulStandart() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.ebay.com/");
        homePage.ebaySighInButton().click();
        sleep(3);
        homePage.emailOrUsernameString().sendKeys("Thetallos7@gmail.com");
        homePage.continueSighInButton().click();
        sleep(3);
        homePage.ebayPasswordString().sendKeys("EBAY192837465a");
        homePage.ebaySighInConntinueButton().sendKeys(Keys.ENTER);
        homePage.shopByCategoryButton().click();
        homePage.selectGuitarCategory().click();
        homePage.selectElectricGuitars().click();
        homePage.selectGibsonCategory().click();

        Assert.assertTrue(homePage.lesPaulStandardButton().isDisplayed());
    }
    @Test
    public void checkEbayJordanSneakers() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.ebay.com/");
        homePage.ebaySighInButton().click();
        sleep(3);
        homePage.emailOrUsernameString().sendKeys("Thetallos7@gmail.com");
        homePage.continueSighInButton().click();
        sleep(3);
        homePage.ebayPasswordString().sendKeys("EBAY192837465a");
        homePage.ebaySighInConntinueButton().sendKeys(Keys.ENTER);
        homePage.takeSnickersButton().click();
        homePage.takeJordanXTravisScott().click();

        Assert.assertTrue(homePage.jordanSneakers().isDisplayed());
    }
    @Test
    public void battleNetShop() {
        HomePage homePage = new HomePage(driver);
        openSite("https://eu.shop.battle.net/en-gb");
        sleep(3);
        homePage.checkWorldOfWarcraftGame().click();
        driver.navigate().back();
        sleep(5);
        homePage.checkWorldOfWarcraftClassicGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkHearthstoneGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkOverwatchGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkDiabloImmortalGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkDiabloIIResurrectedGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkDiabloIIIGame().click();
        driver.navigate().back();
        homePage.checkWarcraftIII().click();
        sleep(3);
        homePage.wrctReforgedIcon().click();
        sleep(3);

        Assert.assertTrue(homePage.buyNowReforgedIIIButton().isDisplayed());
    }
    @Test
    public void eatstreetSocialMediaWindows() {
        HomePage homePage = new HomePage(driver);
        openSite("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.buttonSignIn().click();
        homePage.enterEmail().sendKeys("thetallos7@gmail.com");
        homePage.enterPassword().sendKeys("EATstreet192837465a");
        homePage.acceptSighIn().click();
        sleep(3);
        homePage.facebookIcon().click();
        sleep(3);
        homePage.twitterIcon().click();
        sleep(3);
        homePage.instagramIcon().click();
        sleep(3);
        Set<String> windowsSMIconds = driver.getWindowHandles();
        List<String> windowsSMIconsList = new ArrayList<String>(windowsSMIconds);
        driver.switchTo().window(windowsSMIconsList.get(0));
        sleep(1);
        driver.switchTo().window(windowsSMIconsList.get(1));
        sleep(1);
        driver.switchTo().window(windowsSMIconsList.get(2));
        sleep(1);
        driver.switchTo().window(windowsSMIconsList.get(3));
        sleep(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
    }
}
