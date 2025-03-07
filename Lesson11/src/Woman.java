public final class Woman extends Human {
    final String gender;
    {
        gender="Female";
    }
    public Woman() {
        super();
    }
    public Woman(String name, String surname, int year)
    {
        super(name, surname, year);
    }
    public Woman(String name, String surname, int year, int iq, String[][] schedule)
    {
        super(name, surname, year, iq, schedule);
    }
    @Override
    public void greetPet()
    {
        System.out.println("Helloooo, " + getFamily().getPet().getNickName());
    }
    public void makeUp()
    {
        System.out.println("I am having a glowup");
    }
}