package SDA.model;

public class Room {
    private int roomNr;
    private int guestsCapacity;
    private boolean bathroom;
    private boolean available;
    private boolean balcony;

    public Room(int roomNr,
                int guestsCapacity,
                boolean bathroom,
                boolean available,
                boolean balcony) {

        this.roomNr = roomNr;
        this.guestsCapacity = guestsCapacity;
        this.bathroom = bathroom;
        this.available = available;
        this.balcony = balcony;
    }
    public boolean isAvailable(){
        return this.available;
    }
    public int getRoomNr(){
        return this.roomNr;
    }
    public void setAvailable(boolean a){ this.available=a;}
    @Override
    public String toString() {
        return "Room{" +
                "roomNr=" + roomNr +
                ", available=" + available +
                '}';
    }
}
