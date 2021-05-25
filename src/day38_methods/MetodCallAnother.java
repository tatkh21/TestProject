package day38_methods;



public class MetodCallAnother {
    public static void main(String[] args) {
        start();
        end();
    }


    public static void start() {
        System.out.println("start");
        continues();
    }

    public static void continues() {
        System.out.println("continue");
        end();
    }

    public static void end() {
        System.out.println("end");
    }
}

