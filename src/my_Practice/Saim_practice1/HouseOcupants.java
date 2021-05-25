package my_Practice.Saim_practice1;

public class HouseOcupants {
    public static void main(String[] args) {
        String houseType = "Kvartira";
        int maxOcupants = 0;
        boolean valid = true;
        switch (houseType){
            case "Tree house":
                maxOcupants = 1;
                break;
            case "Mobile home":
                maxOcupants = 2;
                break;
            case "Apartment":
                maxOcupants = 4;
                break;
            case "Town house":
                maxOcupants = 6;
                break;
            case "Villa":
                maxOcupants = 8;
                break;
            case "Mansion":
                maxOcupants = 10;
                break;
            default:
                System.out.println(houseType + " is not a valid type of occupation!");
                valid = false;

        }
        if (valid) {
            System.out.println("Maximum number of occupants for " + houseType + " - " + maxOcupants);
        }
    }
}
