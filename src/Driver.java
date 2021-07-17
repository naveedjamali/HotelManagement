import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    static Hotel hotel = new Hotel();
    public static void main(String[] args) {






    char input = '1';
    while (input!='0'){
        System.out.println("Hotel Management" +
                "\n1: Create Reservation" +
                "\n2: See all current reservations" +
                "\n3: checkout guest" +
                "\n");
        Scanner c = new Scanner(System.in);
        input = c.nextLine().charAt(0);
        switch (input){
            case '1':{
            break;
            }
        }

    }
    }

    public Reservation createReservation(){
        System.out.println("Select the room:");
        int doubleHotelRoom,kingHotelRoom, doubleSuitHotelRoom,doublekingSuitHotelRoom;

        for(int i=0;i<hotel.hotelRooms.size();i++){
            (hotel.hotelRooms.get(i).isVacant){

                            }
        }


        return r;
    }

}
