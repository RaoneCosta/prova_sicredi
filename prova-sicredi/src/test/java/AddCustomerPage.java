import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomerPage {

	private WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	public void fillAddCustomerFields(String field, String content) {

		WebElement wb = driver.findElement(By.xpath("//input[@name='" + field + "']"));
		wb.sendKeys(content);
	}

	public void fillAddCustomerFieldEmployeer(String content) {

		WebElement combo = driver.findElement(By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']"));
		combo.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//li[text()='" + content + "']")).click();

	}

	public void searchLupa(String content) {

		driver.findElement(By.xpath("//a[@class='btn btn-primary search-button t5']")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//input[@class='search-input search-input-big']")).sendKeys(content);

		driver.findElement(By.xpath("//input[@class='search-input search-input-big']")).sendKeys(Keys.ENTER);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// CLICKS
	public void clickBtnSave() {
		WebElement wb = driver.findElement(By.xpath("//button[@id='form-button-save']"));
		wb.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickGoBack() {
		driver.findElement(By.xpath("//a[text()='Go back to list']")).click();
	}

	public void checkBoxAction() {
		driver.findElement(By.xpath("//input[@class='select-all-none']")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickBtnDelete() {
		driver.findElement(By.xpath("//a[@title='Delete']")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickBtnDeleteConfirmation() {
		driver.findElement(By.xpath("//button[@class='btn btn-danger delete-multiple-confirmation-button']")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ASSERTS
	public boolean validateSuccessMessage(String message) {
		WebElement wb = driver.findElement(By.xpath("//div[@id='report-success']/p"));
		String text = wb.getText();

		if (text.contains(message)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateDeleteConfirmationMessage(String message) {
		WebElement wb = driver.findElement(By.xpath("//p[@class='alert-delete-multiple-one']"));
		String text = wb.getText();

		if (text.contains(message)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateConfirmationActionMessage(String message) {
		WebElement wb = driver.findElement(By.xpath("//span[@data-growl='message']/p"));
		String text = wb.getText();

		if (text.contains(message)) {
			return true;
		} else {
			return false;
		}
	}

}
