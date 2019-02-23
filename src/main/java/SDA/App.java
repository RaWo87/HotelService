package SDA;

import SDA.Service.HotelService;
import SDA.model.Hotel;

public class App
{
    public static void main( String[] args )
    {
        Hotel sdaHotel = new Hotel();
        HotelService sdaService = new HotelService(sdaHotel);
        System.out.println(sdaService.getALLRooms());
        System.out.println(sdaService.getAvailableRooms());
        sdaService.bookRoom(2);
        System.out.println(sdaService.getAvailableRooms());
        sdaService.makeAvailable(2);
        System.out.println(sdaService.getAvailableRooms());




    }
}
