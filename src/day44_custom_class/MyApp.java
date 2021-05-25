package day44_custom_class;

public class MyApp {
    public static void main(String[] args) {
        //String app1 = "uber"; this is string object just character
        App uberApp = new App();
        uberApp.name = "Uber";
        uberApp.version = 1.1;
        uberApp.open();//call open method

        uberApp.version= 1.5;
        uberApp.open();


    }
}
