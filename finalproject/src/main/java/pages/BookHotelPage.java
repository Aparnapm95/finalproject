package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Represents the "Book A Hotel" page.
 */
public class BookHotelPage {

    WebDriver driver;

    public BookHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web Elements
    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "address")
    private WebElement address;

    @FindBy(id = "cc_num")
    private WebElement creditCardNumber;

    @FindBy(id = "cc_type")
    private WebElement creditCardType;

    @FindBy(id = "cc_exp_month")
    private WebElement expiryMonth;

    @FindBy(id = "cc_exp_year")
    private WebElement expiryYear;

    @FindBy(id = "cc_cvv")
    private WebElement cvvNumber;

    @FindBy(id = "book_now")
    private WebElement bookNowButton;

    // Actions
    public void fillBookingDetails(String fName, String lName, String addr,
                                   String ccNum, String ccType, String expMonth,
                                   String expYear, String cvv) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        address.sendKeys(addr);
        creditCardNumber.sendKeys(ccNum);
        creditCardType.sendKeys(ccType);
        expiryMonth.sendKeys(expMonth);
        expiryYear.sendKeys(expYear);
        cvvNumber.sendKeys(cvv);
    }

    public void clickBookNow() {
        bookNowButton.click();
    }

    public void bookHotel(String fName, String lName, String addr, String ccNum,
                          String ccType, String expMonth, String expYear, String cvv) {
        fillBookingDetails(fName, lName, addr, ccNum, ccType, expMonth, expYear, cvv);
        clickBookNow();
    }
}


