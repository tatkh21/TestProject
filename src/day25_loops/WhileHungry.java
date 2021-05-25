package day25_loops;
/*
boolean isHungry = true;
    int bananas = 0;
    int countToFull = 3;

    it takes 3 bananas for isHungry to be set to false

    while hungry
        eat banana 1

        when bananas reaches countToFull
            set hungry to false

        increase banana by 1
You do not have permission to send messages in this channel.

 */

public class WhileHungry {
    public static void main (String[]args) {
        int bananas = 0;
        boolean isHungry = true;
        int countToFull =3;

        //while(isHungry || bananas != countToFull)

        while (isHungry){
            bananas++;
            System.out.println("Eating a banana: " + bananas);
            // isHungry = bananas == countToFull? false : true;
            if (bananas == countToFull) {
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas, let's go back to study");



    }
}
