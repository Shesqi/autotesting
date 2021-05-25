//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "c:\\projects\\chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            driver.get("https://www.udemy.com/");
//            Thread.sleep(2000);
//
//            Language changing = new Language();
//            changing.change();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            Thread.sleep(5000);
//
//            driver.quit();
//        }
//    }
//}
