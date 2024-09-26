package helpers;
import browserConfig.ChromeProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import static org.testng.Assert.assertTrue;


public class Test_Methods {
    WebDriver driver;
    Locators locator = new Locators();
    String randomEmail = functions.generateRandomEmail();
    String myUrl = "https://automationexercise.com/login";
    private String emailLogin = "stsolov1@abv.bg";
    private String emailSuccess = "stsolov@abv.bg";
    private String password = "123456789Aa";
    private String name = "Stefan";

    public Test_Methods() {
        ChromeProperties chromeProperties = new ChromeProperties();
        chromeProperties.SetChromeOptions();
        ChromeOptions options = chromeProperties.getChromeOptions();
        driver = new ChromeDriver(options);
    }

    private void acceptCookies(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement button = driver.findElement(By.cssSelector(locator.accept_cookies_button));
        button.click();
    }
    private void login(String RequiredEmail,String RequiredPassword){
        driver.findElement(By.xpath(locator.email_field)).sendKeys(RequiredEmail);
        driver.findElement(By.xpath(locator.password_field)).sendKeys(RequiredPassword);
        driver.findElement(By.xpath(locator.confirm_button)).click();
        String loggedAs = driver.findElement(By.xpath(locator.logged_as_class)).getText();
        assertTrue(loggedAs.contains("Logged in as"));
    }

    public void FailedLogin() {
        driver.get(this.myUrl);
        acceptCookies();
        // Type email and password
        driver.findElement(By.xpath(locator.email_field)).sendKeys(this.emailLogin);
        driver.findElement(By.xpath(locator.password_field)).sendKeys(this.password);

        // Click the login button
        driver.findElement(By.xpath(locator.confirm_button)).click();

        // Assert the message
        boolean isErrorMessageDisplayed = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).isDisplayed();
        if (isErrorMessageDisplayed) {
            System.out.println("Error message is displayed as expected.");
        } else {
            System.out.println("Error message is not displayed.");
        }

    }
    public void TestSignUp(){
        // put the rows below in if condition

        driver.get(this.myUrl);
        acceptCookies();
//
        driver.findElement(By.cssSelector(locator.name_signup_field)).sendKeys(this.name);
        driver.findElement(By.cssSelector(locator.email_signup_field)).sendKeys(this.randomEmail);
        driver.findElement(By.cssSelector(locator.signup_button)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String headerText = driver.findElement(By.cssSelector(locator.signup_header)).getText();
        assertTrue(headerText.contains("ENTER ACCOUNT INFORMATION"));
        //Select Mr.
        driver.findElement(By.cssSelector(locator.male_gender)).click();
        //type password
        driver.findElement(By.cssSelector(locator.signup_password_field)).sendKeys(this.password);
        //birthday
        driver.findElement(By.cssSelector(locator.birthday_days)).sendKeys("29");
        driver.findElement(By.cssSelector(locator.birthday_months)).sendKeys("September");
        driver.findElement(By.cssSelector(locator.birthday_years)).sendKeys("1995");
        //subscriptions
        driver.findElement(By.cssSelector(locator.special_offers)).click();
        driver.findElement(By.cssSelector(locator.newsletter_subscription)).click();
        //address section
        driver.findElement(By.cssSelector(locator.address_name)).sendKeys("Stefanos");
        driver.findElement(By.cssSelector(locator.address_lastname)).sendKeys("Case de Juego");
        driver.findElement(By.cssSelector(locator.company_field)).sendKeys("Shelby ltd.");
        driver.findElement(By.cssSelector(locator.first_address)).sendKeys("Delhi");
        driver.findElement(By.cssSelector(locator.second_address)).sendKeys("Drujba");
        driver.findElement(By.cssSelector(locator.country_dropdown)).click();

        // This should be in a separate function from here
        WebElement dropdownElement = driver.findElement(By.id("country"));

        // Create a Select object
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("United States");

        // Verify if "United States" is the selected option
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String selectedText = selectedOption.getText();
        System.out.println(selectedText);
        //State
        driver.findElement(By.cssSelector(locator.state_field)).sendKeys("Montana");
        //City
        driver.findElement(By.cssSelector(locator.city_field)).sendKeys("Massachusetts");
        //Zipcode
        driver.findElement(By.cssSelector(locator.zipcode_field)).sendKeys("02128");
        //Phone number
        driver.findElement(By.cssSelector(locator.phone_number_field)).sendKeys("83737221");
        //Create account
        driver.findElement(By.cssSelector(locator.create_account)).click();
        String account_created_text = driver.findElement(By.cssSelector(locator.account_created_class)).getText();
        assertTrue(account_created_text.contains("ACCOUNT CREATED!"));
        //continue
        driver.findElement(By.cssSelector(locator.continue_button)).click();
        //assert you are logged as Stefan
        String logged_as_text = driver.findElement(By.xpath(locator.logged_as_class)).getText();

        assertTrue(logged_as_text.contains("Logged in as Stefan"));
    }
    public void LogOut(){
        driver.get(this.myUrl);
        acceptCookies();
        driver.findElement(By.xpath(locator.log_out_button)).click();
        String login_text = driver.findElement(By.cssSelector(locator.login_title)).getText();
        assertTrue(login_text.contains("Login to your account"));
        driver.quit();
    }
    public void AddProductToCart(){

            driver.get(this.myUrl);
            Actions action = new Actions(driver);
            acceptCookies();
            login(this.emailSuccess,this.password);
            driver.findElement(By.xpath(locator.products_button)).click();
            driver.findElement(By.xpath(locator.search_field_products)).sendKeys("Polo");
            driver.findElement(By.xpath(locator.search_button)).click();

            //Hover on the element
            action.moveToElement(driver.findElement(By.xpath(locator.product_window))).perform();
            //Check the value after the hover
            String polo_value = driver.findElement(By.xpath(locator.value_after_hover)).getText();
            assertTrue(polo_value.contains("Rs. 1500"),
                    "Expected Polo product price to contain 'Rs. 1500' but found: " + polo_value);

            String polo_name = driver.findElement(By.xpath(locator.polo_shirt_name)).getText();
            assertTrue(polo_name.contains("Premium Polo T-Shirts"),
                    "Expected Polo product name to contain 'Premium Polo T-Shirts' but found: " + polo_name);




    }
}
