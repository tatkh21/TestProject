package day59_polymorphism_exaptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.getLinkHref();
        link.sendKeys("hi");

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        //loginLink.getLinkHref(); ERROR

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtill.clickElement(loginLink);
        WebElementUtill.clickElement(username);
        //WebElementUtil.clickElement(new String("hello")); String is not child of WebElement

        WebElement login = WebElementUtill.getLinkWithText("login");
        login.click();

    }
}
