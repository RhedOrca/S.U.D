public static void Combat (dealer, target) {
  int currentHP = target.getHP();
  currentHP = currentHP - dealer.getDmg();
  target.setHP(int currentHP);
}
