package browserConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeProperties {
    private ChromeOptions options;

    // Constructor
    public ChromeProperties() {
        try {
            // Attempt to use WebDriverManager to set up ChromeDriver automatically
            WebDriverManager.chromedriver().setup();
        } catch (Exception e) {
            System.out.println("WebDriverManager failed to download ChromeDriver. Using local path as fallback.");
            // Set the ChromeDriver path manually if WebDriverManager fails
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\stsol\\IdeaProjects\\AutomationQA\\Drivers\\chromedriver-win64\\chromedriver.exe");
        }
        SetChromeOptions(); // Initialize Chrome options
    }

    // Method to configure Chrome options
    public void SetChromeOptions() {
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--disable-popup-blocking");
    }

    // Getter for ChromeOptions
    public ChromeOptions getChromeOptions() {
        if (options == null) {
            SetChromeOptions(); // Ensure options are set if not already done
        }
        return options;
    }

    // Method to create and return a new ChromeDriver instance with the configured options
    public WebDriver createChromeDriver() {
        return new ChromeDriver(getChromeOptions());
    }
}
