public class Main {
    public static void main(String[] args) {

        Human lamiye=new Human("Lamiye","Elili",1930);
        Human fazil=new Human("Fazil","Huseynli",1910);
        Family family1=new Family(fazil,lamiye);
        Human aleksa=new Human("Aleksa","Mamedova",1840);
        Human elovset=new Human("Elovset","Agali",1820);
        Family family2=new Family(aleksa,elovset);

        String[][] heqiqetSchedule = {
                {DayOfWeek.THURSDAY.name(), "Oxu"},
                {DayOfWeek.TUESDAY.name(), "Oxu"},
                {DayOfWeek.SATURDAY.name(), "Ve daha cox oxu"}
        };
        Human heqiqet = new Human("Heqiqet", "Huseynli", 1940);
        heqiqet.setSchedule(heqiqetSchedule);

        String[][] ibrahimSchedule = {
                {DayOfWeek.TUESDAY.name(), "Yat"},
                {DayOfWeek.SUNDAY.name(), "Yat"},
                {DayOfWeek.FRIDAY.name(), "Yat"}
        };
        Human ibrahim=new Human("Ibrahim","Mamedov",1860,200,ibrahimSchedule);

        String[][] teymurSchedule = {
                {DayOfWeek.SUNDAY.name(), "Ye"},
                {DayOfWeek.MONDAY.name(), "Ye"},
                {DayOfWeek.TUESDAY.name(), "Ve daha cox ye"}
        };
        Human teymur=new Human("Teymur","Agali",1880,2300,teymurSchedule);

        Pet cat=new Pet(Species.CAT,"Mesi",1000,1000,new String[]{"eat","drink","sleep","purr"});
        family2.addChild(ibrahim);
        family2.addChild(teymur);
        family2.addChild(heqiqet);
        family2.setPet(cat);
        System.out.println(family2);
        System.out.println("==============================");
        family2.deleteChild(new Human("Teymur","Agali",1880, 2300, teymurSchedule));
        System.out.println(family2);
    }
}