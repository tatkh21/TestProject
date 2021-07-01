package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare(){
        System.out.println("Roll the dough, place the topping and chees and bake it");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void serve() {
        System.out.println("serve in plate or in a box");

    }
}
