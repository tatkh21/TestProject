package office_hours.practice_06_28_2021;

public abstract class SocialMedia {
    /*Create an abstract class for Social Media that has the following features:
    -Direct messaging(String username, String message)-Post(String body)-Notifications()•
    The Social Mediawill also have the following fields:-Personal URl (String)-Account length (int)-Platform (static String)

     */
    String personURL;
    int accountLength;
    static String platform;

    public abstract void directMessage(String username, String message);
    public abstract void post(String body);
    public abstract void notification();
}
