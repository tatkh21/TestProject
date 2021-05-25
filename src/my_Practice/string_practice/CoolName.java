package my_Practice.string_practice;

public class CoolName {
    public static void main(String[] args) {
        String name = "Alice";
        if (name.startsWith("A") || name.startsWith("Z")){
            System.out.println(name + ", your name is cool!");
        } else if (name.endsWith("m")){
            System.out.println(name + " is almost cool name ");
        } else {
            System.out.println(name + ", sorry not a cool name");
        }
    }
}
