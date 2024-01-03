package Day2.QueuePractice;

public class City {
    private String name;
    private long population;
    private State state;


    public City() { }

    public City(String name) {
        this.name = name;
    }

    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public City(String name, long population, State state) {
        this.name = name;
        this.population = population;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.population + ")";
    }
    
}


