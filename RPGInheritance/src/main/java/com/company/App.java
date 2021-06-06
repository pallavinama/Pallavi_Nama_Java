package com.company;

public class App {
    public static void main(String[] args) {
        CharacterBase farmerobj1 = new Farmer("Adams");
        System.out.println(farmerobj1);
        CharacterBase constableobj1 = new Constable("charles", "city");
        System.out.println(constableobj1);
        CharacterBase WarriorObj1 = new Warrior("Superman");
        System.out.println(WarriorObj1);
        CharacterBase WarriorObj2 = new Warrior("John");
        System.out.println(WarriorObj2);
    }
}
