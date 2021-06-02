package office_hours.practice_06_01_2021;

public class Developer {

    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;
    private static boolean hasCodingSkills;

    public Developer(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
        hasCodingSkills = true;
    }
    public void coding() {
        System.out.println(this.name + " is coding");
    }
    public void fixingBugs() {
        System.out.println(this.name + " is fixing bugs");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static boolean hasCodingSkills() {
        return hasCodingSkills;
    }


}
