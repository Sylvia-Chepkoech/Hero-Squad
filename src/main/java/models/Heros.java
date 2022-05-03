package models;

import java.util.ArrayList;

public class Heros {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private static int id;
    private static ArrayList <Heros> instances = new ArrayList<>();
    private boolean squadMember;

    public Heros(String name, int age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }
}
