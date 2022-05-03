package models;

import java.util.ArrayList;

public class Squad {
    private String squadName;
    private String squadCause;
    private int maxSize;
    private ArrayList<Heros> heros;
    private  static ArrayList<Squad> squadsInstances = new ArrayList<>();
    private int id;

    public Squad(String squadName, String squadCause, int maxSize, ArrayList<Heros> heros) {
        this.squadName = squadName;
        this.squadCause = squadCause;
        this.maxSize = maxSize;
        this.heros = heros;
        squadsInstances.add(this);
        this.id = squadsInstances.size();

    }

    public String getSquadName() {
        return squadName;
    }

    public String getSquadCause() {
        return squadCause;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ArrayList<Heros> getHeros() {
        return heros;
    }

    public static ArrayList<Squad> getSquadsInstances() {
        return squadsInstances;
    }
    public static Squad findById(int id) {
        try {
            return squadsInstances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
