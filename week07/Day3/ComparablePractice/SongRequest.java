package Day3.ComparablePractice;

import java.util.PriorityQueue;

//Comparable means that any of my SongRequest objects have the ability to be comparaed with a SongRequest
public class SongRequest implements Comparable<SongRequest> {

    private Song song; //A SongRequest HAS-A Song associated with it 
    private double bidAmount;

    public SongRequest(Song song) {
        this.song = song;
    }

    public SongRequest(Song song, double bidAmount) {
        this.song = song;
        this.bidAmount = bidAmount;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    @Override
    public String toString() {
        return "$" + this.bidAmount + " to play " + this.song;
    }


    /*
     * It works by comparing its self with another SongRequest Object
     * 
     * How the compareTo method works is it compares two objects (this and that) to determine if 
     * "this" is greater than, less than , or equal to "that"
     * 
     * compareTo returns an int where:
     * - negative number represents that "this" is less than "that"
     * - positive number represents that "this" is greater than "that"
     * - 0 represents that "this" and "that" are equal
     */
    public int compareTo(SongRequest that) {
        if(this.bidAmount == that.bidAmount) {
            return 0;
        }
        else if(this.bidAmount > that.bidAmount) {
            return -1;
        } 
        else {
            return 1;
        }
    }

    /*
     * Used to store my SongRequests in a queue determined by bidAmount
     * 
     * PriorityQueue
     * - When I add an element to a PriorityQueue, Java compares the newly added element with each of the other elements 
     *   in order to determine its "rank" 
     * - Elements with higher priority can jump to the front of the queue
     * 
     * by Priority means based off of levels
     * - so "lower" number 1, 2, 3 are gonna be higher in priority
     * - level 1 the most important
     * 
     * If my PriorityQueue is based off of bidAmount, I want the higher bids to jump to the front of the 
     * line or ahead of any of the lesser bids
     * 
     * You can't add items to a PriorityQueue unless it implements the Comparable interface
     * 
     * Requirement for a PriorityQueue
     * 1. Either the class should implement the Comparable interface and provide the implementation
     *    for the compareTo() function
     * 2. OR you should provide a custom Comparator while creating the PriorityQueue
     */

     public static void main(String[] args) {
        PriorityQueue<SongRequest> songQueue = new PriorityQueue<>();
        SongRequest samsRequest = new SongRequest(new Song("Take on me", "A-HA"), 25);
        SongRequest rodRequest = new SongRequest(new Song("The End", "The Doors"), 30);
        SongRequest stevenRequest = new SongRequest(new Song("Africa", "Toto"), 50);
        SongRequest abdelRequest = new SongRequest(new Song("Fade into you", "Mazzy Star"), 30.99);
        SongRequest hunterRequest = new SongRequest(new Song("Whole Wide World", "Wreckless Eric"), 11);
        SongRequest carolinesRequest = new SongRequest(new Song("Sunday Morning", "No Doubt"), 100);
        SongRequest bobsRequest = new SongRequest(new Song("Harder, Better, Faster, Stronger", "Daft Punk"), 100);

        int val = samsRequest.compareTo(carolinesRequest);
        System.out.println(val); //this prints based off of priority compared to the other item

        /*
         * -1 means cut ahead of other elements with lesser bids
         * 1 means go behind other elemnts with higher bids
         * 0 mean its equal
         */
        

        int val2 = carolinesRequest.compareTo(bobsRequest);
        System.out.println(val2);

        songQueue.add(samsRequest);

        System.out.println(songQueue.peek());

        songQueue.add(rodRequest);
        songQueue.add(stevenRequest);
        songQueue.add(abdelRequest);
        System.out.println(songQueue.peek());

        songQueue.add(hunterRequest);
        songQueue.add(carolinesRequest);
        songQueue.add(bobsRequest);
        System.out.println(songQueue.peek());

        songQueue.poll();
        System.out.println("Polling head of queue:");
        System.out.println(songQueue.peek());

        songQueue.poll();
        System.out.println("Polling head of queue:");
        System.out.println(songQueue.peek());

        songQueue.poll();
        System.out.println("Polling head of queue:");
        System.out.println(songQueue.peek());

        //System.out.println(songQueue);

     }
}
