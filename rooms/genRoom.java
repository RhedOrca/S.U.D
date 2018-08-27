public class Room{
  private boolean cleared = false;
  private String occupant = null;
  private String treasure = null;
  public boolean getCleared() {
    return cleared;
  }
  public void setCleared() {
    this.cleared = cleared;
  }
  public String getOccupant() {
    return occupant;
  }
  public void setOccupant() {
    this.occupant = occupant;
  }
  public String getTreasure() {
    return treasure;
  }
  public void setTreasure() {
    this.treasure = treasure;
  }
  Room(boolean cleared, String occupant, String treasure) {
    this.cleared = cleared;
    this.occupant = occupant;
    this.treasure = treasure;
    system.out.println("you don't suck");
  }
}

public static class main {
  Room room1 = new Room(false, null, null);
}
