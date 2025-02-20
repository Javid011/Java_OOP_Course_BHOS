import java.util.Random;

class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this(name, surname, year);
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet, String[][] schedule) {
        this(name, surname, year, father, mother);
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    void describePet() {
        String slyness = pet.trickLevel > 50 ? "very sly" : "almost not sly";
        System.out.println("I have an " + pet.species + " is " + pet.age + " years old, he is " + slyness);
    }

    boolean feedPet(boolean isTimeToFeed) {
        if (isTimeToFeed) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species);
            return true;
        } else {
            Random random = new Random();
            int randomNum = random.nextInt(101);
            if (pet.trickLevel > randomNum) {
                System.out.println("Hm... I will feed " + name + "'s " + pet.species);
                return true;
            } else {
                System.out.println("I think " + name + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", mother=" +
                (mother != null ? mother.name + " " + mother.surname : "null") + ", father=" +
                (father != null ? father.name + " " + father.surname : "null") + ", pet=" + pet + "}";
    }
}