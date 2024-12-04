package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logStep {
    WebDriver driver;
    @Given("launch Chrome browser and land on Google.com website")
    public void launch_chrome_browser_and_land_on_google_com_website() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(2000);
    }
    @When("Click on Images link")
    public void click_on_images_link() {
        driver.findElement(By.xpath("//a[text()='Images']")).click();
    }
    @Then("Search for Bengaluru images and hit Enter button")
    public void search_for_bengaluru_images_and_hit_enter_button() throws InterruptedException {
        driver.findElement(By.className("gLFyf")).sendKeys("Bengaluru images", Keys.ENTER);
        Thread.sleep(2000);
    }
    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
