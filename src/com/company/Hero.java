package com.company;

public class Hero {
    private int Health;
    private int Damage;
    private String SuperPower;

    public Hero(int health, int damage, String superPower) {
        Health = health;
        Damage = damage;
        SuperPower = superPower;
    }

    public String getSuperPower() {
        return SuperPower;
    }

    public void setSuperPower(String superPower) {
        SuperPower = superPower;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }
}

