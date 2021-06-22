package office_hours.practice_06_15_2021;

public class Yahoo extends Email{
    static String domain;

    static {
        domain = "Yahoo";
    }

    public Yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
