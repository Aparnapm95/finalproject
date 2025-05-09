package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // Initialize WebElements
	    }

	    // WebElements
	    @FindBy(id = "username")
	    private WebElement usernameField;

	    @FindBy(id = "password")
	    private WebElement passwordField;

	    @FindBy(id = "login")
	    private WebElement loginButton;

	    // Actions
	    public void enterUsername(String username) {
	        usernameField.clear();
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.clear();
	        passwordField.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }

	    public void loginToApplication(String username, String password) {
	        enterUsername(username);
	        enterPassword(password);
	        clickLogin();
	    }
}
