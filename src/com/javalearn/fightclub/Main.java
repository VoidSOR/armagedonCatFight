package com.javalearn.fightclub;

public class Main {
    public static void main(String[] args) {
     Cat lori = new Cat();
     lori.setName("Lori");
     lori.setWeight(6);

     Cat baxter = new Cat();
     baxter.setName("Baxter");
     baxter.setWeight(3);

     FightClub fightClub = new FightClub();
     String catWinnerName = fightClub.fight(lori, baxter);
        System.out.println("Winner:  " + catWinnerName);
        lori.setWeight(1);
        System.out.println("New winner  " + fightClub.fight(lori,baxter));
    }
}
