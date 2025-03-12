import java.util.Arrays;
public class ComparatorApp {
    public static void main(String[] args) {
        Player p1 = new Player("Eli", 30);
        Player p2 = new Player("Veli", 100);
        Player p3 = new Player("Sefteli", 70);
        Player p4 = new Player("Asif", 50);
        Player p5 = new Player("Vasif", 200);
        Player p6 = new Player("Agasif", 300);
        Player p7 = new Player("Lale", 45);
        Player p8 = new Player("Ale", 60);

        Player[] players = {p1, p2, p3, p4, p5, p6, p7, p8};

        Checker checker = new Checker();
        Arrays.sort(players, checker);

        for (Player player : players) {
            System.out.println(player);
        }
    }
}