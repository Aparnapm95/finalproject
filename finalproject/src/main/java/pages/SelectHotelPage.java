package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Represents the "Select Hotel" page.
 */
public class SelectHotelPage {

    WebDriver driver;

    public SelectHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web Elements
    @FindBy(id = "radiobutton_0")
    private WebElement hotelRadioButton;

    @FindBy(id = "continue")
    private WebElement continueButton;

    // Actions
    public void selectHotel() {
        hotelRadioButton.click();
        continueButton.click();
    }
}

