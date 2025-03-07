public class RoboCat extends Pet implements CanFoul{
    Species species;
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        species=Species.ROBO_CAT;
    }
    @Override
    public void respond() {
        System.out.println("RoboCat"+getNickName()+" is planning to dominate the world");
    }
    @Override public Species getSpecies() {
        return species;
    }
    @Override
    public void foul() {
        System.out.println("I need to cover it up (RoboCat)");
    }
}