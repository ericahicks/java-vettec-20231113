package Day4.PriorityQueue;

public class FlightTests {
    public static void main(String[] args) {
        Flight a = new Flight();
        a.joinLine(new Passenger("Rod", 3));
        a.joinLine(new Passenger("Sam", 1));
        a.joinLine(new Passenger("Shawn", 4));
        a.joinLine(new Passenger("Sean", 3));
        a.joinLine(new Passenger("Nasser", 2));
        a.joinLine(new Passenger("Matthew", 4));
        a.board();
        System.out.println(a.passengers);
    }
}
