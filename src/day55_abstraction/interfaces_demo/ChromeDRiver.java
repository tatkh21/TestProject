package day55_abstraction.interfaces_demo;

public class ChromeDRiver implements WebDriver{
    public ChromeDRiver () {
        System.out.println("Launching Chrome Browser");
    }
    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver is quiting");

    }

    @Override
    public String getTitle() {
        return "Wooden spoon";
    }
}
