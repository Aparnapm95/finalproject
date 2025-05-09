package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
public class SearchHotelPage {
	WebDriver driver;

    // Constructor
    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(id = "location")
    private WebElement locationDropdown;

    @FindBy(id = "hotels")
    private WebElement hotelsDropdown;

    @FindBy(id = "room_type")
    private WebElement roomTypeDropdown;

    @FindBy(id = "room_nos")
    private WebElement numberOfRoomsDropdown;

    @FindBy(id = "datepick_in")
    private WebElement checkInDate;

    @FindBy(id = "datepick_out")
    private WebElement checkOutDate;

    @FindBy(id = "adult_room")
    private WebElement adultsPerRoomDropdown;

    @FindBy(id = "child_room")
    private WebElement childrenPerRoomDropdown;

    @FindBy(id = "Submit")
    private WebElement searchButton;

    // Actions
    public void selectLocation(String location) {
        new Select(locationDropdown).selectByVisibleText(location);
    }

    public void selectHotel(String hotel) {
        new Select(hotelsDropdown).selectByVisibleText(hotel);
    }

    public void selectRoomType(String roomType) {
        new Select(roomTypeDropdown).selectByVisibleText(roomType);
    }

    public void selectNumberOfRooms(String rooms) {
        new Select(numberOfRoomsDropdown).selectByVisibleText(rooms);
    }

    public void setCheckInDate(String date) {
        checkInDate.clear();
        checkInDate.sendKeys(date);
    }

    public void setCheckOutDate(String date) {
        checkOutDate.clear();
        checkOutDate.sendKeys(date);
    }

    public void selectAdultsPerRoom(String adults) {
        new Select(adultsPerRoomDropdown).selectByVisibleText(adults);
    }

    public void selectChildrenPerRoom(String children) {
        new Select(childrenPerRoomDropdown).selectByVisibleText(children);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void searchHotel(String location, String hotel, String roomType, String rooms,
                            String checkIn, String checkOut, String adults, String children) {
        selectLocation(location);
        selectHotel(hotel);
        selectRoomType(roomType);
        selectNumberOfRooms(rooms);
        setCheckInDate(checkIn);
        setCheckOutDate(checkOut);
        selectAdultsPerRoom(adults);
        selectChildrenPerRoom(children);
        clickSearch();
    }
	

}
