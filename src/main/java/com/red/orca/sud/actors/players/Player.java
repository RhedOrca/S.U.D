package com.red.orca.sud.actors.players;

import com.red.orca.sud.actors.AbstractActor;

public class Player extends AbstractActor {

    private int Lvl = 1;
    private int XP = 0;

    public int getLvl() {
        return Lvl;
    }

    public void setLvl(final int Lvl) {
        this.Lvl = Lvl;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(final int XP) {
        this.XP = XP;
    }
}
