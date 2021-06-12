package _static_block;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro to Java";
        book.author = "Savitch";
        book.type = "Programming";
        book.price = 85.0;
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Umash";
        audioBook.title = "Selenium cook book";
        audioBook.narrator = "Irina";
        audioBook.price = 44.99;
        audioBook.type = "automation";
        audioBook.length = 60;
        audioBook.listen();

        EBook eBook = new EBook();
        eBook.author = "Leo";
        eBook.title = "New adventures";
        eBook.pages = 100;
        eBook.price = 44.99;
        eBook.type = "fiction";
        eBook.size = 10;
        eBook.readBook();

    }
}
