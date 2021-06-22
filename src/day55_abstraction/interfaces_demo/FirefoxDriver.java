package day55_abstraction.interfaces_demo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigate to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver finding locator " + locator);

    }

    @Override
    public void quit() {
        System.out.println("Firefox quiting ");

    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
