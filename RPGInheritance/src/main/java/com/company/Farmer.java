package com.company;

public class Farmer extends CharacterBase{

    public Farmer(String name){
        super.name = name;
        super.strength = 75;
        super.health = 100;
        super.stamina = 75;
        super.speed = 10;
        super.attackPower = 1;
    }
    // Implementing Base Class Methods that are inherited
    protected void run(){
        System.out.println("farmer run");
    }
    protected void attack(){
        System.out.println("farmer attack");
    }
    protected void heal(){
        System.out.println("farmer heal");
    }
    protected void decreaseHealth(){
        System.out.println("farmer decreaseHealth");
    }
    protected void increaseStamina(){
        System.out.println("farmer increaseStamina");
    }
    protected void decreaseStamina(){
        System.out.println("farmer decreaseStamina");
    }
    //    Below 2 methods are Specific to Farmer class and NOT inherted from Parent
    private void plow(){
        System.out.println("farmer plow");
    }
    private void harvest(){
        System.out.println("farmer harvest");
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }

}
