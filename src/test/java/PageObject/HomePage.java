package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement buttonSignIn() {
        return driver.findElement(By.xpath("//a[@id= 'menu-signin']"));
    }
    public WebElement enterEmail() {
        return driver.findElement(By.xpath("//input[@id= 'email']"));
    }
    public WebElement enterPassword() {
        return driver.findElement(By.xpath("//input[@id= 'password']"));
    }
    public WebElement buttonGotIt() {
        return driver.findElement(By.xpath("//button[text()='Got it']"));
    }
    public WebElement acceptSighIn() {
        return driver.findElement(By.xpath("//button[text()='Sign In']"));
    }
    public WebElement myAccount() {
        return driver.findElement(By.xpath("//li//a[@id= 'menu-my-account']"));
    }
    public WebElement takeHustonTX() {
        return driver.findElement(By.xpath("//a[text()= 'Houston, TX']"));
    }
    public WebElement takeAsianFood() {
        return driver.findElement(By.xpath("//button[text()='View all Asian Food options']"));
    }
    public WebElement categorySelectJapanesFood() {
        return driver.findElement(By.xpath("//label[contains(text(), 'Asian Food')]"));
    }
    public WebElement takeAsianChefRestaurant() {
        return driver.findElement(By.xpath("//a[text()='Asian Chef Restaurant']"));
    }
    public WebElement takeOut() {
        return driver.findElement(By.xpath("//label[@id='takeout-checkbox']"));
    }
    public WebElement becomeDriverApplyNow() {
        return driver.findElement(By.xpath("//a[@class='how-it-works_link'][text()='Apply Now']"));
    }
    public WebElement applyInYourCity() {
        return driver.findElement(By.xpath("//div[@id='referral']"));
    }
    public WebElement takeLawrenceFromList() {
        return driver.findElement(By.xpath("//option[text()='Delivery Driver - Lawrence, KS.']"));
    }
    public WebElement lawrenceDeliveryApply() {
        return driver.findElement(By.xpath("//div[@class='widget-body ng-scope']//button[@class='btn btn-action']"));
    }
    public WebElement submitButton() {
        return driver.findElement(By.xpath("//button[@id='applicationFormSubmitButton']"));
    }
    public WebElement buttonMyAccount() {
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));
    }
    public WebElement addNewAdressButton() {
        return driver.findElement(By.xpath("//a[@id='add-new-address']"));
    }
    public WebElement streetAddressString() {
        return driver.findElement(By.xpath("//input[@id='streetAddress']"));
    }
    public WebElement apt_suiteString() {
        return driver.findElement(By.xpath("//input[@name='aptNumber']"));
    }
    public WebElement cityString() {
        return driver.findElement(By.xpath("//input[@id='city']"));
    }
    public WebElement stateString() {
        return driver.findElement(By.xpath("//input[@id='state']"));
    }
    public WebElement zipString() {
        return driver.findElement(By.xpath("//input[@name='zip']"));
    }
    public WebElement addressLabelString() {
        return driver.findElement(By.xpath("//input[@name='name']"));
    }
    public WebElement newAddressSaveButton() {
        return driver.findElement(By.xpath("//input[@class='btn float-right btn-action']"));
    }
    public WebElement enterYourAddressString() {
        return driver.findElement(By.xpath("//input[@placeholder='Enter Your Address']"));
    }
    public WebElement select4stars() {
        return driver.findElement(By.xpath("//label[text()='Rating 4+']"));
    }
    public WebElement selectCategoriesChineseFood() {
        return driver.findElement(By.xpath("//label[text()='Chinese Food (6)']"));
    }
    public WebElement selectTheChefRestaurant() {
        return driver.findElement(By.xpath("//a[text()='The Chef']"));
    }
    public WebElement menuButton() {
        return driver.findElement(By.xpath("//label[text()='Menu']"));
    }
    public WebElement ebaySighInButton() {
        return driver.findElement(By.xpath("//a[@_sp='m570.l1524']"));
    }
    public WebElement emailOrUsernameString() {
        return driver.findElement(By.xpath("//input[@id='userid']"));
    }
    public WebElement continueSighInButton() {
        return driver.findElement(By.xpath("//button[@id='signin-continue-btn']"));
    }
    public WebElement ebayPasswordString() {
        return driver.findElement(By.xpath("//input[@type='password']"));
    }
    public WebElement ebaySighInConntinueButton() {
        return driver.findElement(By.xpath("//button[@id='sgnBt']"));
    }
    public WebElement searchForEnythingString() {
        return driver.findElement(By.xpath("//input[@id='gh-ac']"));
    }
    public WebElement minValueIn$String() {
        return driver.findElement(By.xpath("//input[@aria-label='Minimum Value in $']"));
    }
    public WebElement maxValueIn$String() {
        return driver.findElement(By.xpath("//input[@aria-label='Maximum Value in $']"));
    }
    public WebElement buyItNowFilter() {
        return driver.findElement(By.xpath("//input[@aria-label='Buy It Now']"));
    }
    public WebElement submitPriceRangeButton() {
        return driver.findElement(By.xpath("//button[@title='Submit price range']"));
    }
    public WebElement shopByCategoryButton() {
        return driver.findElement(By.xpath("//button[@id='gh-shop-a']"));
    }
    public WebElement selectGuitarCategory() {
        return driver.findElement(By.xpath("//a[text()='Guitar']"));
    }
    public WebElement selectElectricGuitars() {
        return driver.findElement(By.xpath("//p[text()='Electric Guitars']"));
    }
    public WebElement selectGibsonCategory() {
        return driver.findElement(By.xpath("//p[text()='Gibson']"));
    }
    public WebElement lesPaulStandardButton() {
        return driver.findElement(By.xpath("//p[text()='Les Paul Standard']"));
    }
    public WebElement takeSnickersButton() {
        return driver.findElement(By.xpath("//h3[text()='Sneakers']"));
    }
    public WebElement takeJordanXTravisScott() {
        return driver.findElement(By.xpath("//div[text()='Jordan x Travis Scott']"));
    }
    public WebElement jordanSneakers() {
        return driver.findElement(By.xpath("Jordan 6 Retro x Travis Scott Olive 2019 - Size 9 "));
    }
    public WebElement checkWorldOfWarcraftGame() {
        return driver.findElement(By.xpath("//a[@title='World of Warcraft']"));
    }
    public WebElement checkWorldOfWarcraftClassicGame() {
        return driver.findElement(By.xpath("//a[@title='World of Warcraft Classic']"));
    }
    public WebElement checkHearthstoneGame() {
        return driver.findElement(By.xpath("//a[@title='Hearthstone']"));
    }
    public WebElement checkOverwatchGame() {
        return driver.findElement(By.xpath("//a[@title='Overwatch']"));
    }
    public WebElement checkDiabloImmortalGame() {
        return driver.findElement(By.xpath("//a[@title='Diablo Immortal']"));
    }
    public WebElement checkDiabloIIResurrectedGame() {
        return driver.findElement(By.xpath("//a[@title='Diablo II: Resurrected']"));
    }
    public WebElement checkDiabloIIIGame() {
        return driver.findElement(By.xpath("//a[@title='Diablo III']"));
    }
    public WebElement checkWarcraftIII() {
        return driver.findElement(By.xpath("//a//img[@alt='Warcraft III']"));
    }
    public WebElement wrctReforgedIcon() {
        return driver.findElement(By.xpath("//img[contains(@slot,'cover') and not(contains(@src, 'WoW_Gear'))]"));
    }
    public WebElement buyNowReforgedIIIButton() {
        return driver.findElement(By.xpath("//a[@id='browsing.product-page.button.buy']"));
    }
    public WebElement facebookIcon() {
        return driver.findElement(By.xpath("//a[@class='es-footer__icon es-footer__icon--facebook']"));
    }
    public WebElement twitterIcon() {
        return driver.findElement(By.xpath("//a[@class='es-footer__icon es-footer__icon--twitter']"));
    }
    public WebElement instagramIcon() {
        return driver.findElement(By.xpath("//a[@class='es-footer__icon es-footer__icon--instagram']"));
    }
}