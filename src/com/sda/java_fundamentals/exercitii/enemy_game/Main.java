package com.sda.java_fundamentals.exercitii.enemy_game;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //un player
        //  -> un nume
//          -> 2 atacuri
//                  -> normal  - damage diferit
//                  -> spell   - damage diferit
//          -> HP (hit points/viata)
//      un inamic
//            -> nume
//            -> HP
//            -> un atac
//
//        randul playerului
//            - alege ce atac foloseste
//        inamicul atac
//        pana cand unul din ei nu mai are H

        // playerul are o data de nastere
        // daca ataca in ziua lui de nastere primeste +10% damage

        LocalDate playerBirthDay = LocalDate.of(1980, 7, 24);
        Player player = new Player("ReadyPlayerOne", 100, 25, 44, playerBirthDay);
        Enemy enemy = new Enemy("Orc", 100, 25);
        Game game = new Game(player, enemy);
        game.run();
    }

}
