package day48_constractor_static;

public class Customer {
    private String name;
    private int id;

    //No Args Constractor
    public Customer() {
        System.out.println("No-args constructor");
        name = "new customer";
        id = -1;
    }
    //add constructor where we can assing name and id
    public  Customer(String name, int id)  {
        System.out.println("a-args constructor");
        this.name = name;//setName(name)
        this.id = id;//setId(id)
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
