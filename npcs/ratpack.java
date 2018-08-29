public class Ratpack {
    private int HP = 20;
    private int Lvl = 1;
    private int Dmg = Math.floor(HP);
    private int xpvalue = 40;
    private boolean isAlive = true;

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLvl() {
        return Lvl;
    }

    public void setLvl(int Lvl) {
        this.Lvl = Lvl;
    }

    public int getDmg() {
        return Dmg;
    }

    public void setDmg(int Dmg) {
        this.Dmg = Dmg;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }
}
