package tests;


import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;
import pages.SearchHotelPage;

public class SearchHotelTest extends BaseClass {

    @Test
    public void searchHotelWithValidData() {
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("aparna1995", "Aparna@1995");

        // Step 2: Search Hotel
        SearchHotelPage searchPage = new SearchHotelPage(driver);
        searchPage.searchHotel(
                "Sydney",       // Location
                "Hotel Creek",  // Hotel
                "Standard",     // Room Type
                "2 - Two",      // No. of Rooms
                "10/06/2025",   // Check-in Date
                "12/06/2025",   // Check-out Date
                "2 - Two",      // Adults per room
                "0 - None"      // Children per room
        );

        // Optional: Assertions or verification steps
        // Assert.assertTrue(driver.getTitle().contains("Select Hotel"));
        System.out.println("Search Hotel test completed.");
    }
}

