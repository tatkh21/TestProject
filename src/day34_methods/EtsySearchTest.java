package day34_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("-------------Starting Etsy search Smoke test---------");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("----------Etsy Search Smoke Test completed----------");
    }
    //open browser
    //navigateToEtsyUrl
    //searchFor WoodenSpoon
    //verifyResultsAreDisplayed
    public static void openBrowser() {
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("Navigate to https://www.etsy.com/ ");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("Pass: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search ");
    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("Pass: search result are successfully displayed");
    }
}
