package com.company;

import java.util.Objects;

public class Warrior extends CharacterBase {
    private int shieldStrength = 100;

    public Warrior(String name){
        super.name = name;
        super.strength = 75;
        super.health = 100;
        super.stamina = 100;
        super.speed = 50;
        super.attackPower = 10;
    }
    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    // Implementing Base Class Methods that are inherited
    protected void run(){
        System.out.println("warrior run");
    }
    protected void attack(){
        System.out.println("warrior attack");
    }
    protected void heal(){
        System.out.println("warrior heal");
    }
    protected void decreaseHealth(){
        System.out.println("warrior decreaseHealth");
    }
    protected void increaseStamina(){
        System.out.println("warrior increaseStamina");
    }
    protected void decreaseStamina(){
        System.out.println("warrior decreaseStamina");
    }

//     Below method Specific to Warrior Class and Not inherited from Base Class
    private void decreaseShieldStrength() {
        System.out.println("warrior shieldStrength "+shieldStrength);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                '}';
    }
}
