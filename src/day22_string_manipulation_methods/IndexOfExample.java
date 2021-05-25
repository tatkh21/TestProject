package day22_string_manipulation_methods;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));// 4 first comma
        System.out.println(technologies.lastIndexOf(","));// 40
        int indexOfJava = (technologies.indexOf("java"));//0
        System.out.println("java index = " + indexOfJava);//0
        int indexOfCss = technologies.indexOf("css");//12
        System.out.println("css is at index = " + indexOfCss);//12
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber index is = " + indexOfCucumber);
        int indexOfSql = technologies.indexOf("sql");
        System.out.println("index of sql = " + indexOfSql);

        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
        if (technologies.indexOf("maven") > -1){
            System.out.println("maven is present");
        } else {
            System.out.println("No maven");
        }


     }
}
