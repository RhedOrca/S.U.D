package com.red.orca.sud.actors;

public abstract class AbstractActor {

    private String name;
    private int hp = 20;
    private int dmg = 1;
    private boolean isAlive = true;

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(final boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(final int hp) {
        this.hp = hp;

        if (this.hp <= 0) {
            isAlive = false;
        }
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(final int Dmg) {
        this.dmg = Dmg;
    }

    public void attack(final AbstractActor target) {
        target.setHp(target.getHp() - getDmg());
    }
}
