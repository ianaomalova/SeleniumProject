import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");


        // Устанавливаем настройки прокси
        String proxyHAddress = "43.245.117.2:5586";
        String proxyHUsername = "kopfjzzz";
        String proxyHPassword = "wzqrltcm7rox";
        String loginInst = "CaptainGonzalo74991";
        String pswInst = "SMS789";
        Proxy proxy = new Proxy();
        proxy.setHttpProxy(proxyHAddress);
        proxy.setSslProxy(proxyHAddress);
        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);
        WebDriver driver = new ChromeDriver(options);

        HasAuthentication authentication = (HasAuthentication) driver;
        authentication.register(() -> new UsernameAndPassword(proxyHUsername, proxyHPassword));
        driver.get("https://www.instagram.com");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement loginInput = driver.findElement(By.name("username"));
        loginInput.sendKeys(loginInst);

        WebElement pswInput = driver.findElement(By.name("password"));
        pswInput.sendKeys(pswInst);

        WebElement enter = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button"));
        enter.click();
    }
}
