package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCoursePage {
	
	//Declartion
	
	@FindBy(xpath="//b[text()='Add New Course']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement nameTF;
	
	@FindBy(id="category")
	private WebElement categoryDropdown;
	
	@FindBy(id="price")
	private WebElement priceTF;
	
	@FindBy(xpath="(//input[@id='photo'])[2]")
	private WebElement photoButton;
	
	@FindBy(xpath="//button[@name='add']")
     private WebElement saveButton;
	
	@FindBy(xpath="//html/body/p")
	private WebElement descriptionTestArea;
	
	//Intialization
	
	public AddNew
	
}
