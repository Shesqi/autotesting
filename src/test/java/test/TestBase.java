package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import page.Main;

import static java.lang.Thread.sleep;

public class TestBase {
    public WebDriver driver;
    public Main main;

    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();


        try {
            sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        main = PageFactory.initElements(driver, Main.class);
    }

    @AfterEach
    public void finish() {
//        driver.quit();
    }
}
