import java.util.Objects;

public class Guest {
    private String firstName, lastName, address;

    private int numberChildrenInParty, numberAdultsInParty;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberChildrenInParty() {
        return numberChildrenInParty;
    }

    public void setNumberChildrenInParty(int numberChildrenInParty) {
        this.numberChildrenInParty = numberChildrenInParty;
    }

    public int getNumberAdultsInParty() {
        return numberAdultsInParty;
    }

    public void setNumberAdultsInParty(int numberAdultsInParty) {
        this.numberAdultsInParty = numberAdultsInParty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return getNumberChildrenInParty() == guest.getNumberChildrenInParty() && getNumberAdultsInParty() == guest.getNumberAdultsInParty() && getFirstName().equals(guest.getFirstName()) && getLastName().equals(guest.getLastName()) && getAddress().equals(guest.getAddress());
    }

}
