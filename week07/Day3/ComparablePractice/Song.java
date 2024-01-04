package Day3.ComparablePractice;

//A class that represents an individual song
public class Song {

    private String name;
    private String artist;

    public Song() { }

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String toString() {
        return this.name + " by " + this.artist;
    }

    
    
}
