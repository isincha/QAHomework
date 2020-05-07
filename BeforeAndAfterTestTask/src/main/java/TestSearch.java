import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestSearch {
    protected WebDriver driver;

    public TestSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.XPATH, using = "//input[@name = 'search']")
    private WebElement inpSearch;
    @FindBy(how = How.XPATH, using = " //div[@class = 'goods-tile__inner']")
    private List<WebElement> listItems;


    public void testsearch(String item) {
        inpSearch.sendKeys(item);
        inpSearch.sendKeys(Keys.ENTER);
    }

}
