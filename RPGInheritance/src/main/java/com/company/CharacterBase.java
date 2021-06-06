package com.company;

public abstract class CharacterBase {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;

    protected abstract void run();
    protected abstract void attack();
    protected abstract void heal();
    protected abstract void decreaseHealth();
    protected abstract void increaseStamina();
    protected abstract void decreaseStamina();

}
