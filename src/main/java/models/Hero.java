package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String heroName;
    private Integer heroAge;
    private String heroAbility;
    private String heroWeakness;
    private String heroSquad;
    private List<Hero> instances=new ArrayList<>();

    public Hero(String heroName, Integer heroAge, String heroAbility, String heroWeakness, String heroSquad, List<Hero> instances) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.heroAbility = heroAbility;
        this.heroWeakness = heroWeakness;
        this.heroSquad = heroSquad;
        this.instances = instances;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Integer getHeroAge() {
        return heroAge;
    }

    public void setHeroAge(Integer heroAge) {
        this.heroAge = heroAge;
    }

    public String getHeroAbility() {
        return heroAbility;
    }

    public void setHeroAbility(String heroAbility) {
        this.heroAbility = heroAbility;
    }

    public String getHeroWeakness() {
        return heroWeakness;
    }

    public void setHeroWeakness(String heroWeakness) {
        this.heroWeakness = heroWeakness;
    }

    public String getHeroSquad() {
        return heroSquad;
    }

    public void setHeroSquad(String heroSquad) {
        this.heroSquad = heroSquad;

    }

    public List<Hero> getInstances() {
        return instances;
    }

    public void setInstances(List<Hero> instances) {
        this.instances = instances;
    }
}
