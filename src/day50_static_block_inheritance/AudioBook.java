package day50_static_block_inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen() {
        System.out.println("Listening to Audio book");
        System.out.println("title = " + title);
        System.out.println("narrator = " + narrator);
        System.out.println("length = " + length);
        System.out.println("price = " + price);
        //added comments
    }


}
