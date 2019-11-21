
public class Character {
    protected int currentHealth, maxHealth, currentLevel, baseAttack, currentAttack, currentEXP, maxEXP;
    protected String name, classPlaceHolder;
    StringBuilder toStringBuild = new StringBuilder();
    public Character(String name_, String classPlaceHolder_, int currentLevel_,int maxHealth_, int baseAttack_, int maxEXP_)
    {
        this.name = name_;
        this.classPlaceHolder = classPlaceHolder_;
        this.currentLevel = currentLevel_;
        this.maxHealth = maxHealth_;
        this.currentHealth = this.maxHealth;
        this.baseAttack = baseAttack_;
        this.currentAttack = this.baseAttack;
        this.currentEXP = 0;
        this.maxEXP = maxEXP_;
    }

    public Character(String name_, int currentLevel_)
    {
        this.name = name_;
        this.classPlaceHolder = "Cardboard Cutout";
        this.currentLevel = currentLevel_;
        this.maxHealth = 100+(10*currentLevel);
        this.currentHealth = this.maxHealth;
        this.baseAttack = 5+(currentLevel);
        this.currentAttack = this.baseAttack;
        this.currentEXP = 0;
        this.maxEXP = 100*currentLevel;
    }

    public Character()
    {
        this.name="Generic Git";
        this.classPlaceHolder = "Cardboard Cutout";
        this.currentLevel = 1;
        this.maxHealth = 100+(10*currentLevel);
        this.currentHealth = this.maxHealth;
        this.baseAttack = 5+(currentLevel);
        this.currentAttack = this.baseAttack;
        this.currentEXP = 0;
        this.maxEXP = 100*currentLevel;
    }

    public String getName()
    {
        return name;
    }

    public String setName(String nameChange)
    {
        name = nameChange;
        return name;
    }

    public int getLevel()
    {
        return currentLevel;
    }

    public int levelUp()
    {
        setCurrentEXP(currentEXP - (currentLevel*100));
        currentLevel++;
        return currentLevel;
    }

    public int getCurrentHealth()
    {
        return currentHealth;
    }

    public int getMaxHealth()
    {
        return maxHealth;
    }

    public int setMaxHealth(int maxHealthChanger)
    {
        maxHealth = maxHealthChanger;
        return maxHealth;
    }

    public int getBaseAttack()
    {
        return baseAttack;
    }

    public int setBaseAttack(int baseAttackChanger)
    {
        baseAttack=baseAttackChanger;
        return baseAttack;
    }

    public int getCurrentAttack()
    {
        return currentAttack;
    }

    public int setCurrentAttack(int currentAttackChanger)
    {
        currentAttack=currentAttackChanger;
        return currentAttack;
    }

    public int getCurrentEXP()
    {
        return currentEXP;
    }

    protected int setCurrentEXP(int EXPchanger)
    {
        currentEXP=EXPchanger;
        return currentEXP;
    }

    public String toString()
    {
        toStringBuild.append("Name: "+name+"\n");
        toStringBuild.append("Class: "+classPlaceHolder+"| Level: "+currentLevel+"\n");
        toStringBuild.append("Current Health: "+currentHealth+"| Max Health: "+maxHealth+"\n");
        System.out.println(toStringBuild.toString());
        return toStringBuild.toString();
    }
}