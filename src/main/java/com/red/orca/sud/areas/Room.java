package com.red.orca.sud.areas;

import com.red.orca.sud.actors.AbstractActor;
import com.red.orca.sud.treasure.Treasure;

import java.util.List;

/**
 * Room in a dungeon.
 */
public class Room {

    private boolean cleared = false;
    private List<AbstractActor> occupants = new ArrayList<occupants>;
    private List<Treasure> treasure = new ArrayList<treasure>;

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

    public void occupantUpdate() {
      for (Iterator<AbstractActor> iterator = occupants.iterator(); iterator.hasNext();){
        /*creates an iterator, iterates through list occupants as long as
        iterator has something after it in list */
        AbstractActor occupant = iterator.next(); // pretty sure this is wrong
        if (this.getIsAlive()) { //if alive, skip to next occupant
        }
        else {          // otherwise (dead), remove from occupant list
          iterator.remove();
        }
      }
    }
}
