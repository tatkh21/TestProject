package office_hours.practice_06_01_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    String productOwner;
    String scrumMaster;
    String businessAnalyst;

    ArrayList<Tester> allTester = new ArrayList<>();
    ArrayList<Developer> allDevelopers = new ArrayList<>();

    int printNumber;

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allDevelopers = new ArrayList<>();
        this.allTester = new ArrayList<>();
    }
    public void addTester(Tester tester) {
        this.allTester.add(tester);
    }
    public void addTester(Tester [] testers) { // Tester ... testers
        this.allTester.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer) {
        this.allDevelopers.add(developer);
    }
    public void addDeveloper(Developer [] developers) { // Tester ... testers
        this.allDevelopers.addAll(Arrays.asList(developers));
    }

    public static void main(String[] args) {

    }
}
