package day48_constractor_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("CyberBugs");//dependency injection.Group depends on String
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addName("Berk");
        group1.addName("Pavel");
        group1.addName("Elvin");
        group1.addName("Ali");
        group1.addName("Parvin");
        group1.addName("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1);


        Group group2 = new Group("Group 8");
        group2.setMembers(Arrays.asList("Kibrio", "Tatyana", "Serhii", "Seren", "Teymur", "Sadia"));
        //print all members
        System.out.println("Group 2 members = " + group2.getMembers());
        //use if statment to see if Seren in group2
        if (group2.getMembers().contains("Seren")) {
            System.out.println("Seren is a member of group8");
        } else {
            System.out.println("Seren is not in group8");
        }
        //remove some members from group1
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1);
    }
}
