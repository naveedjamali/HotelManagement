import java.util.ArrayList;
import java.util.Objects;

class Hotel implements BookHotelRoom, ReservationStatus {

    ArrayList<HotelRoom> hotelRooms = new ArrayList<>();
    ArrayList<Reservation> reservations = new ArrayList<>();

    public ArrayList<HotelRoom> getHotelRooms() {
        return hotelRooms;
    }

    public void setHotelRooms(ArrayList<HotelRoom> hotelRooms) {
        this.hotelRooms = hotelRooms;
    }

    public Hotel() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    hotelRooms.add(new DoubleHotelRooms());
                    hotelRooms.get(j).setAverageNightlyPrice(95.50);
                } else if (i == 1) {
                    hotelRooms.add(new KingHotelRooms());
                    hotelRooms.get(j).setAverageNightlyPrice(96.50);
                } else if (i == 2) {
                    hotelRooms.add(new DoubleSuitHotelRooms());
                    hotelRooms.get(j).setAverageNightlyPrice(105.36);
                } else {
                    hotelRooms.add(new KingSuitHotelRooms());
                    hotelRooms.get(j).setAverageNightlyPrice(104.52);
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return getHotelRooms().equals(hotel.getHotelRooms());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHotelRooms());
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelRooms=" + hotelRooms +
                '}';
    }

    @Override
    public HotelRoom generateReservation() {

        return null;
    }

    @Override
    public void checkIn(Reservation reservation) {
        reservation.hotelRoom.setVacant(false);
        reservations.add(reservation);
    }

    @Override
    public void checkOut(Reservation reservation) {
        reservation.hotelRoom.setVacant(true);
        reservations.remove(reservation);


    }
}