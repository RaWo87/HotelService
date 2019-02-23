package SDA.Service;

import SDA.model.Hotel;
import SDA.model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotelService {
    private Hotel radisonBlue;

    public HotelService(Hotel hotel){
        this.radisonBlue = Objects.requireNonNull(hotel,"must be defined");
    }
    public List<Room> getALLRooms(){
        return radisonBlue.getHotelRooms();
    }
    public List<Room> getAvailableRooms(){
        List<Room> available = new ArrayList<>();

        for (Room room: getALLRooms()
             ) {
            if(room.isAvailable()){
                available.add(room);
            }
        }
        return available;
    }
    public void makeReservation(){}

}
