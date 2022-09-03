package com.sda.java_fundamentals.exercitii.enemy_game;

public class Enemy {
    private String name;
    private int hitPoints;
    private int attack;

    public Enemy(String name, int hitPoints, int attack) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attack = attack;
    }

    public void receiveDamage(int damage) {
        hitPoints -= damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttack() {
        return attack;
    }
}
