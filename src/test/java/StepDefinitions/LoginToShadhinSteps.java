package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.*;

public class LoginToShadhinSteps {
    WebDriver driver = null;

    @Given("open chrome browser")
    public void open_chrome_browser() {
        System.out.println("Inside Step- browser is open");
        System.setProperty("webdriver.chrome.driver","D:\\Practices\\Selenium\\seleniumTesting\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @And("user is on shadin main page")
    public void user_is_on_shadin_main_page() throws InterruptedException {
        System.out.println("Inside Step- user is on shadin main page");
        driver.navigate().to("https://bkash.shadhinmusic.com/");
        Thread.sleep(2000);
    }
    @Given("select login link\\/button")
    public void select_login_link_button() throws InterruptedException {
        System.out.println("Inside Step-select login link/button");
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        Thread.sleep(2000);
    }

    @When("user enter a mobile number and password in respective fields")
    public void user_enter_a_mobile_number_and_password_in_respective_fields()throws InterruptedException {

            System.out.println("Inside Step - input phone and password");
            WebElement inputPhone = driver.findElement(By.className("PhoneInputInput"));
            inputPhone.sendKeys("1521332088");
        Thread.sleep(2000);
            WebElement inputPassword = driver.findElement(By.name("Password"));
            inputPassword.sendKeys("123456");
        Thread.sleep(2000);
    }

    @When("hits enter button")
    public void hits_enter_button() throws InterruptedException{
            System.out.println("Inside Step - clicked login button");
            driver.findElement(By.xpath("//button[@class='btn modal-login']")).submit();
            Thread.sleep(2000);
    }
    @Then("user is navigated to his\\/her profile")
    public void user_is_navigated_to_his_her_profile() throws InterruptedException{
        driver.navigate().to("https://bkash.shadhinmusic.com/my-profile");
        Thread.sleep(8000);
        driver.close();
        driver.quit();
    }

}
