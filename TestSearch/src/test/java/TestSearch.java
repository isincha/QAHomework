import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestSearch {

    @Test
    public void verefySearch(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:/Users/ilya/IdeaProjects/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait webDriverWait = new WebDriverWait(driver,4);
        driver.manage().window().maximize();
        driver.get("https://reddit.com/");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("xbox");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[3]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/a/div/h3/span")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[3]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/a/div/h3/span")).click();
        driver.getCurrentUrl().contains("xbox");

        driver.quit();
    }
}
