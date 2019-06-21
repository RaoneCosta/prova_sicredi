import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	// Objects
	public WebElement versionOption() {
		return driver.findElement(By.xpath("//select[@id='switch-version-select']"));
	}

	public WebElement btnAddCustomer() {
		return driver.findElement(By.xpath("//a[@class='btn btn-default btn-outline-dark']"));
	}

	// Actions
	public void changeVersion(String version) {
		versionOption().sendKeys(version);
	}

	public void clickBtnAddCustomer() {
		btnAddCustomer().click();
	}

}
