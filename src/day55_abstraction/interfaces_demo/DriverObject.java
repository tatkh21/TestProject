package day55_abstraction.interfaces_demo;

public class DriverObject {
    public static void main(String[] args) {

        //WebDriver driver = new WebDriver():ERROR cannot create object of interface
        ChromeDRiver driver1 = new ChromeDRiver();
        FirefoxDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new ChromeDRiver();

        driver1.get("https://www.google.com");
        driver1.findElement("//input[.=text']");
        System.out.println("Title = " + driver1.getTitle());

    }
}
