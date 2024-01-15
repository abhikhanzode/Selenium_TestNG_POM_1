// LoginTest.java
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://20.197.24.53:9011/TracesenseDBSWeb/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest() {
        loginPage.enterUsername("mallil@winjit.com");
        loginPage.enterPassword("Admin@123");
        loginPage.clickLoginButton();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
