package day59_polymorphism_exaptions;

public class WebElementUtill {
    /**
     * method with polymorphic
     * @param element element and can accept any child
     */
    public static void clickElement(WebElement element) {
        System.out.println("Clicking on Element");
        element.click();

    }
    public static WebElement getLinkWithText(String txt) {
        System.out.println("Serch for a link with text = " + txt);
        return new Link();
    }

}
