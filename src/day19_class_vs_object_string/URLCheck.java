package day19_class_vs_object_string;

public class URLCheck {
    public static void main(String[] args) {
        String url = "https://www.amazon.com";
        if(url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Goverment website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education websitre");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }

    }
}
