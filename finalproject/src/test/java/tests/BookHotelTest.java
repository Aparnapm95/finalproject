package tests;


import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;
import pages.BookHotelPage;



public class BookHotelTest extends BaseClass {

    @Test
    public void bookHotelFlowTest() {
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

        // Step 4: Book Hotel
        BookHotelPage bookPage = new BookHotelPage(driver);
        bookPage.bookHotel(
                "John",         // First Name
                "Doe",          // Last Name
                "123 Test Street, Sydney", // Address
                "4111111111111111", // Credit Card Number
                "VISA",         // Card Type
                "May",          // Expiry Month
                "2026",         // Expiry Year
                "123"           // CVV
        );

        System.out.println("Book Hotel test completed.");
    }
}

