public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Alabas", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Zerife", "Memmedli", 1890);
        Human father = new Human("Ebulfet", "Memmedli", 2003);
        String[][] schedule = {{"Saturday", "go shopping"}, {"Sunday", "play games"}};
        Human child = new Human("Aftandil", "Memmedli", 1870, 9, mother, father, dog, schedule);
        System.out.println(child);
        child.greetPet();
        child.describePet();
        child.feedPet(false);
        System.out.println("\nCreating another family:");
        Pet cat = new Pet("cat", "<Mestan>", 60, 69, new String[]{"jump", "climb", "scratch"});
        Human mom2 = new Human("Zerqelem", "Qaraqurbanli", 1998);
        Human dad2 = new Human("Fazil", "Qaraqurbanli", 1958);
        Human kid2 = new Human("Sahmeddin", "Qaraqurbanli", 2008, 160, mom2, dad2, cat, schedule);
        System.out.println(kid2);
        kid2.greetPet();
        kid2.describePet();
        kid2.feedPet(true);
    }
}
