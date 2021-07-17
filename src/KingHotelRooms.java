
class KingHotelRooms extends HotelRoom {
    public KingHotelRooms() {
        setCapacity(3);
    }

    @Override
    public boolean equals(HotelRoom obj) {
        return this.getCapacity()==obj.getCapacity() && this.getAverageNightlyPrice()==obj.getAverageNightlyPrice() &&
                this.isVacant()==obj.isVacant() && this.isHasMiroFridge()==obj.isHasMiroFridge();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}