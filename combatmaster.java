public static void combat(dealer,target){
        int CurrentHP=target.getHP();
        CurrentHP=CurrentHP-dealer.getDmg();
        target.setHP(CurrentHP);
        }
