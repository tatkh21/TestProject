package replit_project.OOP.Animal;

public abstract class Animals {
        private String name;
        private int age;

  public Animals(String name, int age) {
            this.name=name;
            this.age=age;
        }
        public void setName (String name){
            this.name = name;
        }
        public void setAge (int age) {
            this.age = age;
        }
        public int getAge(){
            return age;
        }
        public String getName () {
            return name;
        }
        public abstract int getAgeInHumanYears();


}
