public static void main(String[]args){
        Room room1=new makeroom(false,null,null);
        room1.makeroom();
        }

public class Room {
    private boolean cleared = false;
    private String occupant = null;
    private String treasure = null;

    private boolean getCleared() {
        return cleared;
    }

    private void setCleared(boolean cleared) {
        this.cleared = cleared;
    }

    private String getOccupant() {
        return occupant;
    }

    private void setOccupant(String occupant) {
        this.occupant = occupant;
    }

    private String getTreasure() {
        return treasure;
    }

    private void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    public void makeroom(boolean cleared, String occupant, String treasure) {
        this.cleared = cleared;
        this.occupant = occupant;
        this.treasure = treasure;
        system.out.println("you don't suck");
    }
}
