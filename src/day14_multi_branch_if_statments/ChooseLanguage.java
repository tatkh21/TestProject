package day14_multi_branch_if_statments;
/*
selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          -----> "lets talk java and english, hello"
You do not have permission to send messages in this channel.


 */
public class ChooseLanguage {
    public static void main (String[]args){
        int num = 5;
        if (num == 1){
            System.out.println("hello, thank for your call");
        } else if (num == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (num == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (num == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        }else if (num == 5) {
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("lets talk java and english, hello");
        }
    }
}
