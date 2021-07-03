package replit_project.OOP.Animal;

public class Dog extends Animals{
    String breed;
    int humanYears;
    public Dog (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Breed: " + breed + "\n" +
                "Age in calendar years: " + getAge() + "\n"+
                "Age in human years: " + getAgeInHumanYears() ;
    }
    @Override
    public int getAgeInHumanYears(){

        if (getAge() < 2 || getAge() == 2) {
            humanYears = getAge() * 11;
        } else {
            humanYears = 22 + ((getAge()-2) * 5);
        } return humanYears;
    }

    public boolean equals(Dog dog) {
        return (getName().equals(dog.getName())&&
                breed.equals(dog.breed)&&
                getAge()==dog.getAge());
    }


}
