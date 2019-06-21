import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ProvaSicrediTest extends BaseClass {

	@Test
	public void Desafio1() {

		HomePage homePage = new HomePage(driver);
		AddCustomerPage addCustomerPage = new AddCustomerPage(driver);

		homePage.changeVersion("Bootstrap V4 Theme");
		homePage.clickBtnAddCustomer();

		addCustomerPage.fillAddCustomerFields("customerName", "Teste Sicredi");
		addCustomerPage.fillAddCustomerFields("contactLastName", "Teste");
		addCustomerPage.fillAddCustomerFields("contactFirstName", "Raone"); // seu nome = pegadinha?
		addCustomerPage.fillAddCustomerFields("phone", "51 9999-9999");
		addCustomerPage.fillAddCustomerFields("addressLine1", "Av Assis Brasil, 3970");
		addCustomerPage.fillAddCustomerFields("addressLine2", "Torre D");
		addCustomerPage.fillAddCustomerFields("city", "Porto Alegre");
		addCustomerPage.fillAddCustomerFields("state", "RS");
		addCustomerPage.fillAddCustomerFields("postalCode", "91000-000");
		addCustomerPage.fillAddCustomerFields("country", "Brasil");
		addCustomerPage.fillAddCustomerFieldEmployeer("Fixter");
		addCustomerPage.fillAddCustomerFields("creditLimit", "200");

		addCustomerPage.clickBtnSave();

		assertTrue(addCustomerPage.validateSuccessMessage("Your data has been successfully stored into the database."));
	}

	@Test
	public void Desafio2() {

		HomePage homePage = new HomePage(driver);
		AddCustomerPage addCustomerPage = new AddCustomerPage(driver);

		homePage.changeVersion("Bootstrap V4 Theme");
		homePage.clickBtnAddCustomer();

		addCustomerPage.fillAddCustomerFields("customerName", "Teste Sicredi");
		addCustomerPage.fillAddCustomerFields("contactLastName", "Teste");
		addCustomerPage.fillAddCustomerFields("contactFirstName", "Raone"); // seu nome = pegadinha?
		addCustomerPage.fillAddCustomerFields("phone", "51 9999-9999");
		addCustomerPage.fillAddCustomerFields("addressLine1", "Av Assis Brasil, 3970");
		addCustomerPage.fillAddCustomerFields("addressLine2", "Torre D");
		addCustomerPage.fillAddCustomerFields("city", "Porto Alegre");
		addCustomerPage.fillAddCustomerFields("state", "RS");
		addCustomerPage.fillAddCustomerFields("postalCode", "91000-000");
		addCustomerPage.fillAddCustomerFields("country", "Brasil");
		addCustomerPage.fillAddCustomerFieldEmployeer("Fixter");
		addCustomerPage.fillAddCustomerFields("creditLimit", "200");

		addCustomerPage.clickBtnSave();

		assertTrue(addCustomerPage.validateSuccessMessage("Your data has been successfully stored into the database."));

		addCustomerPage.clickGoBack();

		addCustomerPage.searchLupa("Teste Sicredi");

		addCustomerPage.checkBoxAction();

		addCustomerPage.clickBtnDelete();

		assertTrue(addCustomerPage.validateDeleteConfirmationMessage("Are you sure that you want to delete this 1 item"));

		addCustomerPage.clickBtnDeleteConfirmation();

		assertTrue(addCustomerPage.validateConfirmationActionMessage("Your data has been successfully deleted from the database."));
	}

}
