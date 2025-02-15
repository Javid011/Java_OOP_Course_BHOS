public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Sebine", "Qarayeva", 1900);
        Human father = new Human("Fuad", "Qarayev", 1890);
        Family family = new Family(mother, father);

        Pet pet = new Pet("it", "Alabas", 7, 30, new String[]{"ye", "ic", "yat"});
        family.setPet(pet);

        Human child = new Human("Aftandil", "Qarayev", 1920, 5, new String[][]{{"1ci_gun", "Uniye get"}});
        family.addChild(child);

        System.out.println(family);
        child.greetPet();
        child.describePet();
    }
}