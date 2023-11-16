import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Inst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");


        // Устанавливаем настройки прокси
//        String proxyHAddress = "43.245.117.2:5586";
//        String proxyHUsername = "kopfjzzz";
//        String proxyHPassword = "wzqrltcm7rox";
        String loginInst = "GreenForrest1958";
        String pswInst = "SMS789";
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy(proxyHAddress);
//        proxy.setSslProxy(proxyHAddress);
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("proxy", proxy);
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
//
//        HasAuthentication authentication = (HasAuthentication) driver;
//        authentication.register(() -> new UsernameAndPassword(proxyHUsername, proxyHPassword));
        driver.get("https://www.instagram.com");

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement loginInput = driver.findElement(By.name("username"));
        loginInput.sendKeys(loginInst);
    }
}
