import java.util.Objects;

public class Reservation {
    double totalCostForTheStay;
    Guest guest;
    HotelRoom hotelRoom;

    @Override
    public String toString() {
        return "Reservation{" +
                "totalCostForTheStay=" + totalCostForTheStay +
                ", guest=" + guest +
                ", hotelRoom=" + hotelRoom +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Double.compare(that.getTotalCostForTheStay(), getTotalCostForTheStay()) == 0 && getGuest().equals(that.getGuest()) && getHotelRoom().equals(that.getHotelRoom());
    }


    public double getTotalCostForTheStay() {
        return totalCostForTheStay;
    }

    public void setTotalCostForTheStay(double totalCostForTheStay) {
        this.totalCostForTheStay = totalCostForTheStay;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }
}
