package day16_switch_ternary;
/*"Floor 1 selected. Companies: Lobby, Verizon, Starbucks"

when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"

when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

anything else: print "Invalid floor - 6"

 */
public class Elevator {
    public static void main (String[]args){
        int floorNum = 7;
        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verison");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor -" + floorNum);
        }
        System.out.println("==================Switch Statment==============");
        floorNum = 4;
        switch (floorNum){
            case 1:          // same as if floor 1
                System.out.println("Floor 1 selected. Companies: Lobby, Verison");
                break;//exit switch
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;//exit switch
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floor -" + floorNum);

        }
    }

}
