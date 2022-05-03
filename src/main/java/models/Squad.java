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
}
