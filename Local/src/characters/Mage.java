package characters;

public class Mage extends Role
{
    public Mage(String name_, String classPlaceHolder_, int currentLevel_, int maxHealth_, int baseAttack_, int baseArmor_, int baseInit_)
    {
        super(name_,"Mage",currentLevel_,maxHealth_,baseAttack_,baseArmor_,baseInit_);
        this.maxEXP = 100*currentLevel_;
    }

    public Mage(String name_, int currentLevel_)
    {
        this(name_, "Mage", currentLevel_, 60 + (6*currentLevel_),
                12 + currentLevel_*5, 0+(currentLevel_/5), 10+(currentLevel_*2));
    }

    public Mage()
    {
        this("Tim The Enchanter","Mage",10,120,62,2,30);
    }

    //Ecters
    public void levelUp()
    {
        if(this.currentEXP >= 100*this.currentLevel)
        {
            this.currentEXP-=(100*this.currentLevel);
            this.currentLevel++;
            hpUp();
            attackUp();
            armorUp();
            initUp();
        }
    }

    public void hpUp()
    {
        setMaxHealth(6);
    }

    public void attackUp()
    {
        setBaseAttack(5);
    }

    public void armorUp()
    {
        if(currentLevel%5==0)
        {
            setBaseArmor(1);
        }
    }

    public void initUp()
    {
        setInit(2);
    }
}
