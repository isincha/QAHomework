public class DataProvider {
    @org.testng.annotations.DataProvider(name = "Test1")
    public Object[][] Test1() {
        return new Object[][]{
                {"макбук"},
                {"айфон"},
                {"эйрподс"}
        };
    }
}
