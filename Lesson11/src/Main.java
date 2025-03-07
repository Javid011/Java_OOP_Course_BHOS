public class Main {
    public static void main(String[] args) {

        Woman firuze=new Woman("Firuze","Tehmiyeva",630);
        Man elekber=new Man("Elekber","Tehmiyev",620);
        Family family1=new Family(firuze,elekber);

        Woman lale=new Woman("Lale","Ucanzade",650);
        Man aye=new Man("Aye","Ucanzade",660);
        lale.setIq(100);
        aye.setIq(200);
        Family family2=new Family(lale,aye);

        String[][] talehSchedule = {
                {DayOfWeek.SUNDAY.name(), "laugh"},
                {DayOfWeek.TUESDAY.name(), "have fun"},
                {DayOfWeek.SATURDAY.name(), "live ur life"},};
        Man taleh = new Man("Taleh", "Tehmiyev", 640);
        taleh.setSchedule(talehSchedule);

        String[][] lamiyeSchedule = {
                {DayOfWeek.MONDAY.name(), "Till I collapse"},
                {DayOfWeek.THURSDAY.name(), "Lose yourself"},
                {DayOfWeek.FRIDAY.name(), "Godzilla"},
                {DayOfWeek.SUNDAY.name(), "Taboo"}
        };
        Woman lamiye=new Woman("Lamiye","Ucanzade",625,81,lamiyeSchedule);
        Man kisi=new Man("Kisi","Enlikurek",619);
        family2.addChild(lamiye);
        family2.addChild(kisi);
        family2.addChild(taleh);
        family2.bornChild();
        System.out.println(family2);
        System.out.println(" ");
        family2.deleteChild(new Man("Kisi","Enlikurek",619));
        System.out.println(family2);
    }
}