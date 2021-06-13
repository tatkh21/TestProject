package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someOne) {
        System.out.println("Chatting with " + someOne
        );
    }
    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Vladislav");
    }
    /*
    override download method
     */
    @Override
    public boolean download() {
        System.out.println("Downloaded Discord 0.0.23 from App St");
        return true;
    }
    public void printInfo () {
        System.out.println("App name " + getName());
        System.out.println("App version " + getVersion());
    }

}
