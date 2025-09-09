package demoqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBox {



    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        // Enter "Selenium" into the Full Name field (located by ID: userName)
        driver.findElement(By.id("userName")).sendKeys("Selenium");
        // Enter email into the Email field (located by ID: userEmail)
        driver.findElement(By.id("userEmail")).sendKeys("selenium.use@demo.com");
        // Enter "Texas" into the Current Address field
        driver.findElement(By.id("currentAddress")).sendKeys("Texas");
        // Enter "USA" into the Permanent Address field
        driver.findElement(By.id("permanentAddress")).sendKeys("USA");
        // Click the Submit button (located by ID: submit)
        driver.findElement(By.id("submit")).click();
        driver.quit();

    }
}
