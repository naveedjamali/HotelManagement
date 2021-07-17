
abstract class HotelRoom {
    int capacity;
    boolean hasMiroFridge;
    double averageNightlyPrice;
    boolean isVacant;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHasMiroFridge() {
        return hasMiroFridge;
    }

    public void setHasMiroFridge(boolean hasMiroFridge) {
        this.hasMiroFridge = hasMiroFridge;
    }

    public double getAverageNightlyPrice() {
        return averageNightlyPrice;
    }

    public void setAverageNightlyPrice(double averageNightlyPrice) {
        this.averageNightlyPrice = averageNightlyPrice;
    }

    public boolean isVacant() {
        return isVacant;
    }

    public void setVacant(boolean vacant) {
        isVacant = vacant;
    }

    public abstract boolean equals(HotelRoom obj);

    @Override
    public String toString() {
        return "Capacity: " + capacity + "\nAverage Nightly Price: " + averageNightlyPrice +
                "\nHas Micro Fridge: " + hasMiroFridge + "\nIs Vacant: " + isVacant;
    }

}
