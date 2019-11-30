package characters;

public class Archer extends Role
{
    public Archer(String name_, String classPlaceHolder_, int currentLevel_, int maxHealth_, int baseAttack_, int baseArmor_, int baseInit_)
    {
        super(name_,"Archer",currentLevel_,maxHealth_,baseAttack_,baseArmor_,baseInit_);
        this.maxEXP = 100*currentLevel_;
    }

    public Archer(String name_, int currentLevel_)
    {
        this(name_, "Archer", currentLevel_, 70 + (7*currentLevel_),
                7 + currentLevel_*2, 1+(currentLevel_/10), 10+(currentLevel_));
    }

    public Archer()
    {
        this("Robin Hood","Archer",10,140,27,2,20);
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
        setMaxHealth(7);
    }

    public void attackUp()
    {
        setBaseAttack(2);
    }

    public void armorUp()
    {
        if(currentLevel%3==0)
        {
            setBaseArmor(1);
        }
    }

    public void initUp()
    {
        setInit(3);
    }
}
