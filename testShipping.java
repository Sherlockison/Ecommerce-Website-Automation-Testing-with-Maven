package com.sherlockison;

// Test shipping of items with valid login credentials.
// TestNG framework.

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testShipping {
    // Declarations of driver
    WebDriver driver;
    // Storing Url
    String url = "https://www.saucedemo.com";
    // user-name
    String user = "standard_user";
    // password
    String pass = "secret_sauce";
    // first name
    String first_name = "John";
    // Last name
    String last_name = "Xess";
    // Pincode
    String pincode = "734002";

    // Browser setup
    @BeforeSuite
    public void setup() {
        // Setting system property
        WebDriverManager.chromedriver().setup();
        // Assigning browser to driver
        driver = new ChromeDriver();
        // Maximizing window
        driver.manage().window().maximize();
        // Opening Url
        driver.get(url);
    }

    // Sign-in
    @BeforeMethod
    public void sign_in() {
        // Finding userid and password input box
        WebElement userbox = driver.findElement(By.id("user-name"));
        WebElement passbox = driver.findElement(By.id("password"));
        // Sending userid and password
        userbox.sendKeys(user);
        passbox.sendKeys(pass);
        // Clicking the log-in button
        driver.findElement(By.id("login-button")).click();
    }

    // Tests
    @Test
    public void test_1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until backpack appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"item_4_img_link\"]/img")));
        // Click on the catalogue of backpack
        driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
        // Wait until the catalogue appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-backpack")));
        // Click on add to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        // Go back to the shopping page
        driver.findElement(By.id("back-to-products")).click();

        //Wait until the items are visible in shopping page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
        // Add t-shirt to the cart
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        // Add fleece jacket to the cart
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        // Go to cart by clicking on it
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

        //Wait until the items in cart is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        // Remove fleece jacket to the cart
        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
        // Click on checkout
        driver.findElement(By.id("checkout")).click();

        // Wait until the Personal Information page is loaded
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        // First name is entered
        driver.findElement(By.id("first-name")).sendKeys(first_name);
        // Last name is entered
        driver.findElement(By.id("last-name")).sendKeys(last_name);
        // Pincode is entered
        driver.findElement(By.id("postal-code")).sendKeys(pincode);
        // Click on the continue button
        driver.findElement(By.id("continue")).click();

        // Wait until the finish page appears 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        // Get and print payment information
        System.out.println("Payment Information: " + driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]")).getText());
        // Get and print shipping information
        System.out.println("Shipping Information: " + driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]")).getText());
        // Get and print Item Total
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")).getText());
        // Get and print Tax
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")).getText());
        // Get and print Total
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText());
        // Click on the finish button
        driver.findElement(By.id("finish")).click();

        // Wait until Checkout Complete page loads
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")));
        System.out.println();
        // Get and print messages
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText());
        driver.findElement(By.id("back-to-products")).click();
    }

    // Sign-out
    @AfterMethod
    public void sign_out() {
        // Finding and clicking navigation button
        driver.findElement(By.id("react-burger-menu-btn")).click();
        // Wait until sign-out button appears
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        // Click on the sign-out button
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    // Closing of browser
    @AfterSuite
    public void tear_down() {
        // Wait until login-page reappears
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        // Close the browser
        driver.quit();
    }
}

