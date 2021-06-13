package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.useTheApp(20);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(10);
        instagram.setVersion(6.234);
        instagram.download();

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(6.234);
        b22Discord.useTheApp(100);
        b22Discord.download();
        b22Discord.printInfo();
        System.out.println(b22Discord.getName());
    }






}
