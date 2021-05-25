package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name = "Alice";
        employee2.name = "Tania";
        employee3.name = "Mila";

        employee1.jobTitle = "PO";
        employee2.jobTitle = "SDET";
        employee3.jobTitle = "Developer";

        employee1.work();
        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);
        employee2.work();
        System.out.println(employee2.name);
        System.out.println(employee2.jobTitle);
        employee3.work();
        System.out.println(employee3.name);
        System.out.println(employee3.jobTitle);
    }
}
