package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(300, 50, "fire bool");
        System.out.println("хп" + boss.getHealth() + "урон" + boss.getDamage() + boss.getDefence());

        Hero[] team = createHeroes();
        for (Hero i :team ) {
            System.out.println(" Здоровье! " + i.getHealth() + " Урон! " +  i.getDamage() + " Способность! " + i.getSuperPower());

        }

    }
    public static Hero[] createHeroes(){
        Hero mia = new Hero(200, 25, "stan");
        Hero mark = new Hero(250, 20, "create");
        Hero dog = new Hero(150, 30);

        Hero[] team = {mia, mark, dog};
        return team;

    }

}
