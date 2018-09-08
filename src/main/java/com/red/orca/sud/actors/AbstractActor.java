package com.red.orca.sud.actors;

import java.util.random;
import com.red.orca.sud.areas.Room;

public abstract class AbstractActor {

    private String name;
    private int maxHp = 20;
    private int hp = 20;
    private boolean isAlive = true;
    private int dr = 0;
    private int melDmg = 1;
    private int melAcc = 90;
    private int magDmg = 1;
    private int magAcc = 70;
    private int rngdDmg = 1;
    private int rngdAcc = 80;
    private int meleeResist = 0;
    private int rngdResist = 0;
    private int magResist = 0;


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
        finally {
          remove
        }
    }

    public int getMelDmg() {
        return MelDmg;
    }

    public void setMelDmg(final int dmg) {
        this.MelDmg = dmg;
    }

    public int getMagDmg() {
        return magDmg;
    }

    public void setMagDmg(final int dmg) {
        this.MagDmg = dmg;
    }

    public int getRngdDmg() {
        return rngdDmg;
    }

    public void setRngdDmg(final int dmg) {
        this.rngdDmg = dmg;
    }

    public int getDR() {
      return dr;
    }

    public void setDR(final int dr) {
      this.dr = dr;
    }

    public void resetDR() {
      this.dr = 0;
    }



    public void slash(final AbstractActor target) {
      if (getDmg() - target.getMeleeResist()) > 0) {
        target.setHp(target.getHp() - (getDmg() - target.getResist());
      }
      else {
        System.out.println(this.name + "'s attack did no damage!");
      }
      finally {
        System.out.println(target.name + " has " + target.getHP() + " health.")
      }
    }

    public void spark(final AbstractActor target) {
        int hitchance = Math.floor(Math.random() * 100);
        if hitchance <= getMagAcc() { //magic accuracy is out of 100
          target.setHp(target.getHp() - getMagDmg());
        }
        else {
          System.out.println(this.name + "'s Spark missed!");
        }
    }

    public void defend() { //heal for 1, gain 2 DR.
      if (getHp() + 1) <= this.maxHp {
        setHp(getHp() + 1);
      }
      else{
        setHp(maxHp);
      }
      finally{
        setDR(2);
      }
    }

    public void shoot(final AbstractActor target) {
      //have a % chance to deal actor's range damage
      int hitchance = Math.floor(Math.random() * 100);
      if hitchance >= getRngdAcc() {
        target.setHp(target.getHp() - getRngdDmg());
      }
      else {
        System.out.println("Your shot missed!");
      }
    }
}
