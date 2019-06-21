import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;

    @Before
    public void classLevelSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
