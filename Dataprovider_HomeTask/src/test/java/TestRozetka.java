import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestRozetka extends WebDriverSettings {
    private static final By languageList = By.xpath("//li[@class='header-topline__language-item']");
    private static final By searchButton = By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']");
    @DataProvider(name = "TestRoz")
    public Object[][] dataProvider() {
        return new Object[][] {
                {"RU", "Найти"},
                {"UA", "Знайти"}
        };
    }
    @Test(dataProvider = "TestRoz")
    public void Test1(String languageExample, String button){
        WebElement langElement = driver.findElements(languageList).stream().filter(f -> f.getText().contains(languageExample)).findAny().get();
        langElement.click();
        String searchBtnText = driver.findElement(searchButton).getText();
        assertEquals(searchBtnText, button);
    }



}
