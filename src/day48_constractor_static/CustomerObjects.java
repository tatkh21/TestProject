package day48_constractor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());//print with default value that are set in no_arggs constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);//reated object and assinged value in one line
        Customer cs3 = new Customer ("Jon Word", 4873);
        System.out.println(cs2);
        System.out.println(cs3);


        //array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //ArrayList of Customer objects
        List<Customer> listOfCustomers = new ArrayList<>();
        listOfCustomers.add(cs1);
        listOfCustomers.add(cs2);
        listOfCustomers.add(cs3);
        listOfCustomers.add(new Customer("Bashir", 3426));
        listOfCustomers.add(new Customer("Suleyman", 9763));

        //Print info of customer object in aarray and arraylist
        System.out.println(todaysCustomers[0]);
        System.out.println(listOfCustomers.get(1).toString());
        System.out.println(listOfCustomers);

        System.out.println("-----FOR LOOP-----");
        for (int i = 0; i < listOfCustomers.size() ; i++) {

            System.out.println(listOfCustomers.get(i));
        }
        System.out.println("----FOR EACH LOOP------");
        for (Customer each : listOfCustomers) {
            System.out.println(each);
        }
        //print only names from customers list
        System.out.println("-------Names of Customers---");
        //forEach method with lambda
         listOfCustomers.forEach(each -> System.out.println(each.getName()));
         for (Customer eachCustomer : listOfCustomers) {
             System.out.println(eachCustomer.getName());
         }


    }
}
