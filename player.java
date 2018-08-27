public static class player{
  private String name;
  private int HP = 20;
  private int Lvl = 1;
  private int Dmg = 1;
  private int XP = 0;
  private boolean isAlive = true;
  public boolean getIsAlive() {
    return isAlive;
  }
  public void setIsAlive() {
    this.isAlive = isAlive;
  }
  public String getName() {
    return name;
  }
  public void setName() {
    this.name = name;
  }
  public int getHP() {
    return HP;
  }
  public void setHP() {
    this.HP = HP;
  }
  public int getLvl() {
    return Lvl;
  }
  public void setLvl() {
    this.Lvl = Lvl;
  }
  public int getDmg() {
    return Dmg;
  }
  public void setDmg() {
    this.Dmg = Dmg;
  }
  public int getXP() {
    return XP;
  }
  public void setXP() {
    this.XP = XP;
  }
}
