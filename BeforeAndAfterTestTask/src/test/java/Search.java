import org.testng.annotations.Test;


public class Search extends DriverSettings {
    @Test(dataProvider = "Test1", dataProviderClass = DataProvider.class)
    public void searchTest(String text) {
        TestSearch page = new TestSearch(driver);
        page.testsearch(text);
    }
}

