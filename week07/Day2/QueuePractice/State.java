package Day2.QueuePractice;

import java.util.ArrayList;

public class State {
    private String name;
    private City capital;
    private ArrayList<City> cities;

    public State() {}

    public State(String name) {
        this.name = name;
    }

    public State(String name, City capital) {
        this.name = name;
        this.capital = capital;
    }

    public State(String name, City capital, ArrayList<City> cities) {
        this.name = name;
        this.capital = capital;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "State [name=" + name + ", capital=" + capital + ", cities=" + cities + "]";
    }

    
    
    
}
