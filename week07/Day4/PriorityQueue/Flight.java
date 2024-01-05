package Day4.PriorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class Flight {

    PriorityQueue<Passenger> passengers;

    public Flight() {
        this.passengers = new PriorityQueue<>(new PassengerComparator());
    }

    public void joinLine(Passenger p) {
        passengers.add(p);
    }

    public void board() {
        System.out.println("Boarding:");
        //loop through removing
        //for loop using the size

        //similar to the while loop, once a passenger boards it is removed from the queue
        for(int i = passengers.size(); i > 0; i--) {
            //System.out.println(" " + passengers.poll());
        }
        //while loop using isEmpty
        while(!passengers.isEmpty()) {
            System.out.println(" " + passengers.poll());
        }
    }

    @Override
    public String toString() {
        return passengers.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengers);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Flight other = (Flight) obj;
        if (passengers == null) {
            if (other.passengers != null)
                return false;
        } else if (!passengers.equals(other.passengers))
            return false;
        return true;
    }

    
    

    
    
}
