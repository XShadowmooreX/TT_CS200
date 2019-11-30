import characters.*;

public class PersonaTester {
    public static void main(String[] args)
    {
        Role newb = new Role();
        System.out.println(newb);

        Archer noob = new Archer();
        System.out.println(noob.getMaxEXP());

        Warrior woob = new Warrior();
        System.out.println(woob.getMaxEXP());

        Mage moob = new Mage();
        System.out.println(moob.getMaxEXP());
    }
}
