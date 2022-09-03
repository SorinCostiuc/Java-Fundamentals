package com.sda.java_fundamentals.exercitii.enemy_game;

import java.util.Scanner;

public class Game {
    private Player player;
    private Enemy enemy;

    public Game(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    //    randul playerului
//            - alege ce atac foloseste
//    inamicul atac
//    pana cand unul din ei nu mai are HP
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (player.getHitPoints() > 0 && enemy.getHitPoints() > 0) {
            //afisam 2 optiuni de atac
            System.out.println("You have to choose between: ");
            System.out.println("1 - normalAtack - " + player.getNormalAttack());
            System.out.println("2 - spellAtack - " + player.getSpellAttack());
            int attackOption = scanner.nextInt();
            if (attackOption == 1) {
                attackAndReceive(player.getNormalAttack());
            } else if (attackOption == 2) {
                attackAndReceive(player.getSpellAttack());
            } else {
                System.out.println("Try to choose from the presented values");
            }
        }

        if (player.getHitPoints() > enemy.getHitPoints()) {
            System.out.println("The winner is " + player.getName());
        } else if (player.getHitPoints() == enemy.getHitPoints()) {
            System.out.println("DRAW!");
        } else {
            System.out.println("The winner is " + enemy.getName());
        }
    }

    public void attackAndReceive(int damage) {
        if (player.isAnniversary()) {
            int damageToAdd = (int) (damage * 0.10);
            damage += damageToAdd;
            System.out.println("Happy Birthday! We increased your damage by " + damageToAdd);
        }

        enemy.receiveDamage(damage); //playerul ataca inamicul cu spell atack
        System.out.println("Player attacked enemy with " + damage + " damage.");
        if (enemy.getHitPoints() > 0) {
            player.receiveDamage(enemy.getAttack()); // inamicul ataca payerul
            System.out.println("Enemy attacked player with " + enemy.getAttack() + " damage");
        }

        if (player.getHitPoints() > 0 && enemy.getHitPoints() > 0) {
            System.out.println("Player hp left: " + player.getHitPoints());
            System.out.println("Enemy hp left: " + enemy.getHitPoints());
        }
    }

}
