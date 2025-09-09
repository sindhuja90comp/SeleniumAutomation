import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

   public static void main(String[] args){

       // Setup ChromeDriver automatically (no need to download manually)
       WebDriverManager.chromedriver().setup();

       // Create a new instance of Chrome browser
       WebDriver driver = new ChromeDriver();

       // Open Google homepage in the Chrome browser
       driver.get("https://www.google.com");

   }


}
