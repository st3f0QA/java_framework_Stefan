package browserConfig;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeProperties {
    private ChromeOptions options;
    public void SetChromeOptions(){
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--disable-popup-blocking");

    }
    public ChromeOptions getChromeOptions() {
        if (options == null) {
            SetChromeOptions(); // Ensure options are set if not already done
        }
        return options;
    }
    //Set the path to your webdriverChrome.driver. In best case you would only replace the file in the following path
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stsol\\IdeaProjects\\AutomationQA\\Drivers\\chromedriver-win64\\chromedriver.exe");
    }
}
