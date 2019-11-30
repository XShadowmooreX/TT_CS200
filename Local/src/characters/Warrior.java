package characters;

public class Warrior extends Role {
    public Warrior(String name_, String classPlaceHolder_, int currentLevel_, int maxHealth_, int baseAttack_, int baseArmor_, int baseInit_)
    {
        super(name_,"Warrior",currentLevel_,maxHealth_,baseAttack_,baseArmor_,baseInit_);
        this.maxEXP = 100*currentLevel_;
    }

    public Warrior(String name_, int currentLevel_)
    {
        this(name_, "Warrior", currentLevel_, 70 + (7*currentLevel_),
                7 + currentLevel_*2, 1+(currentLevel_/10), 10+(currentLevel_));
    }

    public Warrior()
    {
        this("Maximus Meridius","Warrior",10,200,20,3,10);
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
        setMaxHealth(10);
    }

    public void attackUp()
    {
        setBaseAttack(1);
    }

    public void armorUp()
    {
        if(currentLevel%2 == 0)
        {
            setBaseArmor(1);
        }
    }

    public void initUp()
    {
        setInit(0);
    }

    public String toString()
    {
        return "Name: " + getName() + "\nClass: " + getClassType() + "\nLevel: " + getLevel()
                + "\nCurrent Attack: " + getCurrentAttack() + "\nCurrent Health: " + getCurrentHealth()
                + "\nMax Health: "+getMaxHealth();
    }
}
