import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeQA {

    @Test
    public void FirstTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("softserve");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3"));
        WebElement FR = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3"));
        String FResult = FR.getText();
        if (FResult.contains("SoftServe")) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Incorrect");
        }
        driver.quit();
    }
}