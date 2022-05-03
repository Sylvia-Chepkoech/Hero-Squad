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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public static ArrayList<Heros> getAllInstances() {
        return instances;
    }

    public boolean isSquadMember() {
        return squadMember;
    }

    public void updateHeroStatus(boolean squadMember){
        this.squadMember = squadMember;
    }

    public static int getId() {
        return id;
    }

    public static Heros findById(int id) {
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public static void setId(int id) {
        Heros.id = id;
    }
}

