//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class test {
//    public static void test(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "c:\\projects\\chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        Actions actions = new Actions(driver);
//
//        driver.get("https://www.udemy.com/");
//
//        try {
//            Thread.sleep(3000);
//
//            String title = driver.getTitle();
//
//            Assert.assertEquals(title, "Online Courses - Learn Anything, On Your Schedule | Udemy");
//
//            WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
//            WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
//
//            wait.until(ExpectedConditions.visibilityOf(searchButton));
//
//            searchInput.sendKeys("Java");
//
//            searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
//
//            // перед кликом сделать валидацию на присутствие объекта "кнопка"
//            searchButton.click();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            Thread.sleep(5000);
//
//            driver.quit();
//        }
//
//
//
////        myButton.click();
//
////        String par = element.getCssValue("transition");
////        System.out.println(par);
//
//
//
//
//
//    }
//}
