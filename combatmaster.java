public static void class Combat(){
    public void damage(dealer, target) {
      int CurrentHP=target.getHP(); //gets targets hp
      CurrentHP=CurrentHP-dealer.getDmg(); //subtracts dealer's damage from target's hp
      target.setHP(CurrentHP); //uses target's setter to update with new health
      }
}
