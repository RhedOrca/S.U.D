package com.red.orca.sud.areas;

import com.red.orca.sud.actors.AbstractActor;
import com.red.orca.sud.treasure.Treasure;

import java.util.List;

/**
 * Room in a dungeon.
 */
public class Room {

    private boolean cleared;
    private List<AbstractActor> occupants;
    private List<Treasure> treasure;

    /**
     * Room constructor.
     * @param cleared
     * @param occupant
     * @param treasure
     */
    public Room(final boolean cleared,
                final List<AbstractActor> occupant,
                final List<Treasure> treasure) {
        this.cleared = cleared;
        this.occupants = occupant;
        this.treasure = treasure;

        System.out.println("You definitely suck...");
        System.out.println("But that is ok...");
        System.out.println("Here is a room...");
    }

    private boolean getCleared() {
        return cleared;
    }

    private void setCleared(boolean cleared) {
        this.cleared = cleared;
    }

    private List<AbstractActor> getOccupants() {
        return occupants;
    }

    private void setOccupant(List<AbstractActor> occupants) {
        this.occupants = occupants;
    }

    private List<Treasure> getTreasure() {
        return treasure;
    }

    private void setTreasure(List<Treasure> treasure) {
        this.treasure = treasure;
    }

}
