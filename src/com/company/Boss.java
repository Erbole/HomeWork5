package com.company;

public class Boss {
    private int Health;
    private int Damage;
    private String Defence;

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

    public String getDefence() {
        return Defence;
    }

    public void setDefence(String defence) {
        Defence = defence;
    }

    public void setHealth (int health, int damage, String defence){
        this.Health = health;
        this.Damage = damage;
        this.Defence = defence;
    }

    Boss(int Health, int Damage, String Defence){
        System.out.println("Конструктор " + this);
        this.Health = Health;
    }
}
