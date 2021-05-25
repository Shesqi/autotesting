package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Main extends PageBase {
    String SITE_URL = "https://udemy.com";
    String LANG_MODAL_BTN = "//button[contains(@class, 'header--language-selector-trigger-button')]";
    String LANG_MODAL = "//div[contains(@class, 'language-selector-modal-trigger--modal')]";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(SITE_URL);
        return this;
    }

    public Main openLanguageModal() {
        click(By.xpath(LANG_MODAL_BTN));
        return this;
    }

    public Main checkModalIsOpen() {
        isElementDisplayed(By.xpath(LANG_MODAL));
        System.out.println("good");
        return this;
    }

    public void scrollAction() {
        Actions actionProvider = new Actions(driver);
        WebElement student = driver.findElement(By.xpath("//div[@class='non-student-cta-content-wrapper']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        actionProvider.moveToElement(student).build().perform();
//        js.executeScript("window.scrollBy(0,2500)");
    }

    public Main checkSearch() {
        WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));

        searchInput.click();
        searchInput.sendKeys("Java");



        wait.until(ExpectedConditions.visibilityOf(searchButton));


//        searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        return this;
    }
}
