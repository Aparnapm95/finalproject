package tests;


import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;

public class SelectHotelTest extends BaseClass {

    @Test
    public void selectHotelFlowTest() {
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("aparna1995", "Aparna@1995");

        // Step 2: Search Hotel
        SearchHotelPage searchPage = new SearchHotelPage(driver);
        searchPage.searchHotel(
                "Sydney",
                "Hotel Creek",
                "Standard",
                "2 - Two",
                "10/06/2025",
                "12/06/2025",
                "2 - Two",
                "0 - None"
        );

        // Step 3: Select Hotel
        SelectHotelPage selectPage = new SelectHotelPage(driver);
        selectPage.selectHotel();

        // Optional: Add assertion to verify navigation to "Book A Hotel"
        System.out.println("Select hotel test completed.");
    }
}

