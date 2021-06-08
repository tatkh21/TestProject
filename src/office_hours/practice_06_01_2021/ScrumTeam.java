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

    public boolean  removeTester(int employeeId) {
        for (int i = 0; i < allTester.size(); i++) {
            if (allTester.get(i).getEmployeeID() == employeeId) {
                allTester.remove(i);
                return true;

            }
        }
        return false;
    }
    public boolean removeDeveloper (int employeeId) {
        int size = allDevelopers.size();
        allDevelopers.removeIf(eachDev -> eachDev.getEmployeeId() == employeeId);
        return  size != allDevelopers.size();
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", businessAnalyst='" + businessAnalyst + '\'' +
                ", allTester=" + allTester +
                ", allDevelopers=" + allDevelopers +
                ", printNumber=" + printNumber +
                '}';
    }

    public static void main(String[] args) {
        ScrumTeam scrumTeam = new ScrumTeam("Ziba", "John", "Fikret");
        System.out.println(scrumTeam.allTester);
        Tester tester1 = new Tester("Maxim", 10, "SDET", 1000000);
        scrumTeam.addTester(tester1);
        scrumTeam.addTester(new Tester("Anna", 11, "SDET", 10000000));
        System.out.println(scrumTeam.allTester);

        scrumTeam.addDeveloper(new Developer("Anton", 1, "dev", 10000000));
        System.out.println(scrumTeam.allDevelopers);

    }
}
