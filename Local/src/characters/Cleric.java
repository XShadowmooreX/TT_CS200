package characters;

public class Cleric extends Role {
    public Cleric(String name_, String classPlaceHolder_, int currentLevel_, int maxHealth_, int baseAttack_, int baseArmor_, int baseInit_)
    {
        super(name_,"Cleric",currentLevel_,maxHealth_,baseAttack_,baseArmor_,baseInit_);
        this.maxEXP = 100*currentLevel_;
    }

    public Cleric(String name_, int currentLevel_)
    {
        this(name_, "Cleric", currentLevel_, 70 + (7*currentLevel_),
                7 + currentLevel_*2, 1+(currentLevel_/10), 11+(currentLevel_));
    }

    public Cleric()
    {
        this("Jesus Christ","Cleric",10,200,20,3,20);
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
        setMaxHealth(8);
    }

    public void attackUp()
    {
        setBaseAttack(1);
    }

    public void armorUp()
    {
        if(currentLevel%3 == 0)
        {
            setBaseArmor(1);
        }
    }

    public void initUp()
    {
        setInit(1);
    }

    public String toString()
    {
        return "Name: " + getName() + "\nClass: " + getClassType() + "\nLevel: " + getLevel()
                + "\nCurrent Attack: " + getCurrentAttack() + "\nCurrent Health: " + getCurrentHealth()
                + "\nMax Health: "+getMaxHealth();
    }
}

