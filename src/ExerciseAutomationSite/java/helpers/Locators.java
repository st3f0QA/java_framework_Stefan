package helpers;

public class Locators {
    //Page
    public String accept_cookies_button = ".fc-button.fc-cta-consent.fc-primary-button";
    //login form
    public String email_field = "//input[@name='email']";
    public String password_field = "//input[@data-qa='login-password']";
    public String confirm_button = "//button[@data-qa='login-button']";
    public String login_title = ".login-form";
    //sign up form
    public String name_signup_field = "[data-qa='signup-name']";
    public String email_signup_field = "[data-qa='signup-email']";
    public String signup_button = "[data-qa='signup-button']";
    //Signup page
    public String signup_header = ".title.text-center";
    public String male_gender = "[id='id_gender1']";
    public String signup_password_field = "[data-qa='password']";
    public String birthday_days = "[data-qa='days']";
    public String birthday_months = "[data-qa='months']";
    public String birthday_years = "[data-qa='years']";
    public String newsletter_subscription = "[id='newsletter']";
    public String special_offers = "[id='optin']";
    // Address section
    public String address_name = "[data-qa='first_name']";
    public String address_lastname = "[data-qa='last_name']";
    public String company_field = "[data-qa='company']";
    public String first_address = "[data-qa='address']";
    public String second_address = "[data-qa='address2']";
    public String country_dropdown = "[data-qa='country']";

    public String state_field = "[data-qa='state']";
    public String city_field = "[data-qa='city']";
    public String zipcode_field = "[data-qa='zipcode']";
    public String phone_number_field = "[data-qa='mobile_number']";
    //buttons
    public String create_account = "[data-qa='create-account']";

    public String account_created_class = "[data-qa='account-created']";
    public String continue_button = "[data-qa='continue-button']";

    //navigation menu
    public String products_button = "/html/body/header[@id='header']/div[@class='header-middle']/div[@class='container']/div[@class='row']/div[@class='col-sm-8']/div[@class='shop-menu pull-right']/ul[@class='nav navbar-nav']/li[2]/a";
    public String logged_as_class = "/html/body/header[@id='header']/div[@class='header-middle']/div[@class='container']/div[@class='row']/div[@class='col-sm-8']/div[@class='shop-menu pull-right']/ul[@class='nav navbar-nav']/li[10]/a";
    public String log_out_button = "/html/body/header[@id='header']/div[@class='header-middle']/div[@class='container']/div[@class='row']/div[@class='col-sm-8']/div[@class='shop-menu pull-right']/ul[@class='nav navbar-nav']/li[4]/a";
    //Search
    public String search_field_products = "/html/body/section[@id='advertisement']/div[@class='container']/input[@id='search_product']";
    public String search_button = "/html/body/section[@id='advertisement']/div[@class='container']/button[@id='submit_search']";
    //products
    public String product_window = "/html/body/section[2]/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[@class='col-sm-4']";
    public String value_after_hover = "/html/body/section[2]/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[@class='col-sm-4']/div[@class='product-image-wrapper']/div[@class='single-products']/div[@class='product-overlay']/div[@class='overlay-content']/h2";
    public String polo_shirt_name = "/html/body/section[2]/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[@class='col-sm-4']/div[@class='product-image-wrapper']/div[@class='single-products']/div[@class='product-overlay']/div[@class='overlay-content']/p";
}
