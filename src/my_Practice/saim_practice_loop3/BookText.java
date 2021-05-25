package my_Practice.saim_practice_loop3;

public class BookText {
    public static void main(String[] args) {
        String textbook = "Java textbook By Murodil. Chapter 1 datatypes and variables. " +
                "Chapter 2 conditional statements. chapter 3 String manipulation. Chapter 4 Loops." +
                " Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static. " +
                "Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and " +
                "Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more. ";
        int chapterCount = 0;
        int pricePerChapter = 10;
        int bookPrice = 0;
        for (int i = 0; i < textbook.length()-6; i++) {
            String chapter = textbook.substring(i, i+7);
            if (chapter.equalsIgnoreCase("chapter")){
                bookPrice += pricePerChapter;
                chapterCount++;
            }
        }
        System.out.println(chapterCount + " Chapters - value of the book: $" + bookPrice  );
    }
}
