package quizes.q3.nikoloz_beridze_3;

import java.util.ArrayList;

public class Room {
    Integer roomID;
    ArrayList<Person> tenants = new ArrayList<>();

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public void checkIn(Person person) {
        tenants.add(person);
    }

    public void checkOut(Person person) {
        tenants.remove(person);
    }

    public ArrayList<Person> getTenants() {
        return tenants;
    }
}
