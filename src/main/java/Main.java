//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Proxy;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;

import java.util.Properties;


public class Main {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");


        // Устанавливаем настройки прокси
        String proxySAddress = "195.123.241.75:10724";
        String proxySUsername = "malovayai";
        String proxySPassword = "bovEikjvTu";

        String proxyHAddress = "43.245.117.2:5586";
        String proxyHUsername = "kopfjzzz";
        String proxyHPassword = "wzqrltcm7rox";


     Properties props = System.getProperties();
     props.setProperty("socksProxyHost", "195.123.241.75");
     props.setProperty("socksProxyPort", String.valueOf("10724"));
     props.setProperty("java.net.socks.username", "malovayai");
     props.setProperty("java.net.socks.password", "bovEikjvTu");
     WebDriver driver = new ChromeDriver();
//        Proxy proxy = new Proxy();
//        proxy.setSocksProxy(proxySAddress);
//        proxy.setSslProxy(proxySAddress);
//        proxy.setSocksUsername(proxySUsername);
//        proxy.setSocksPassword(proxySPassword);
//        proxy.setSocksVersion(5);
//
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("proxy", proxy);
//
//        WebDriver driver = new ChromeDriver(options);

//     ChromeOptions options = new ChromeOptions();
//     Proxy proxy = new Proxy();
////     proxy.setSocksVersion(5);
////     proxy.setSocksProxy(proxyAddress);
//     proxy.setHttpProxy("43.245.117.2:5586");
//     proxy.setSslProxy("43.245.117.2:5586");
//     options.addArguments("--proxy-server=http://kopfjzzz:wzqrltcm7rox@y43.245.117.2:5586");
//     WebDriver driver = new ChromeDriver(options);

        //------------------------------------------------------
//        ТЕКУЩИЙ РАБОЧИЙ КОД
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy(proxyHAddress);
//        proxy.setSslProxy(proxyHAddress);



        // Запускаем браузер с настройками прокси
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("proxy", proxy);
//        //options.addArguments("--proxy-server=http://" + proxyHAddress);
//
//        WebDriver driver = new ChromeDriver(options);

        // Открываем веб-сайт
        driver.get("https://2ip.ru");







     //-------------------------------------------------------------------------
     //КОД С ПОИСКОМ В ГУГЛЕ
        // Ищем поле поиска
//        WebElement searchInput = driver.findElement(By.name("q"));

        // Вводим в поле поиска запрос "Selenium"
//        searchInput.sendKeys("Утки");

        // Нажимаем кнопку поиска
//        driver.findElement(By.name("btnK")).click();
//        searchInput.submit();
        // Закрываем браузер
//        driver.quit();
    }
}
