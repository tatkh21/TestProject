package day50_static_block_inheritance;

public class EBook extends Book {
    int size;
    int pages;
    public void readBook() {
        System.out.println("Reading: " );
        System.out.println("Title = " + title);
        System.out.println("author = " + author);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);

    }
}
