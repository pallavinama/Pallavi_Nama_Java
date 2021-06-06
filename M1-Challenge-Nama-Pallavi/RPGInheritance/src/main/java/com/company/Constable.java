package com.company;

import java.util.Objects;

public class Constable extends CharacterBase {
    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super.name = name;
        super.strength = 60;
        super.health = 100;
        super.stamina = 60;
        super.speed = 20;
        super.attackPower = 5;
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
// Implementing Base Class Methods that are inherited
    protected void run() {
        System.out.println("constable run");
    }
    protected void attack() {
        System.out.println("constable attack");
    }
    protected void heal() {
        System.out.println("constable heal");
    }
    protected void decreaseHealth() {
        System.out.println("constable decreaseHealth");
    }
    protected void increaseStamina() {
        System.out.println("constable increaseStamina");
    }
    protected void decreaseStamina() {
        System.out.println("constable decreaseStamina");
    }

//    Below Method is specific to Constable Class and NOT Inherited from Parent/Base Class
    private void arrest() {
        System.out.println("constable arrest");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
