package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String squadName;
    private int maxSize;
    private String squadCause;
    private List<Squad> instances=new ArrayList<>();
    private int currentSize;
    private List<Hero> Heroes;
    private int mId;

    public Squad(String squadName, int maxSize, String squadCause, List<Squad> instances, int currentSize, List<Hero> heroes, int mId) {
        this.squadName = squadName;
        this.maxSize = maxSize;
        this.squadCause = squadCause;
        this.instances = instances;
        this.currentSize = currentSize;
        Heroes = heroes;
        this.mId = mId;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getSquadCause() {
        return squadCause;
    }

    public void setSquadCause(String squadCause) {
        this.squadCause = squadCause;
    }

    public List<Squad> getInstances() {
        return instances;
    }

    public void setInstances(List<Squad> instances) {
        this.instances = instances;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public List<Hero> getHeroes() {
        return Heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        Heroes = heroes;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
}
