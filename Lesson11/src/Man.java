public final class Man extends Human {
    final String gender;
    {
        gender="Male";
    }
    public Man()
    {
        super("Not", "Applicable", -1, -1, new String[0][0]);
    }
    public Man(String name, String surname, int year)
    {
        super(name, surname, year, -1, new String[0][0]);
    }
    public Man(String name, String surname, int year, int iq, String[][] schedule)
    {
        super(name, surname, year, iq, schedule);
    }
    @Override
    public void greetPet()
    {
        System.out.println("Hello, " + getFamily().getPet().getNickName());
    }
    public void repairCar()
    {
        System.out.println("I am doing what I am told to do");
    }
}