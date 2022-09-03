package com.sda.java_fundamentals.exercitii.enemy_game;

import java.time.LocalDate;
import java.time.LocalTime;

public class Player {
    private String name;
    private int hitPoints;
    private int normalAttack;
    private int spellAttack;
    private LocalDate birthday;


    public Player(String name, int hitPoints, int normalAttack, int spellAttack, LocalDate birthday) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.normalAttack = normalAttack;
        this.spellAttack = spellAttack;
        this.birthday = birthday;
    }

    public void receiveDamage(int damage) {
        this.hitPoints -= damage;
    }

    public boolean isAnniversary() {
        //ce zi si luna este azi
        LocalDate currentDate = LocalDate.now();
        //comparam luna si ziua cu birthday-ul lui
        return currentDate.getMonthValue() == birthday.getMonthValue() && currentDate.getDayOfMonth() == birthday.getDayOfMonth();
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getNormalAttack() {
        return normalAttack;
    }

    public int getSpellAttack() {
        return spellAttack;
    }
}
