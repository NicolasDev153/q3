package quizes.q3.nikoloz_beridze_3;

import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    Map<Integer, Room> guestRoomMap = new HashMap<>();

    public void displayInfo() {
        for (Map.Entry<Integer, Room> entry : guestRoomMap.entrySet()) {
            System.out.println("Room ID: " + entry.getKey());
            System.out.println("Tenants: ");
            for (Person tenant : entry.getValue().getTenants()) {
                System.out.println(tenant.getName() + " " + tenant.getSurname());
            }
        }
    }


    public void checkIn(Person person, Room room) {
        person.checkIn(person, room);
        guestRoomMap.put(room.getRoomID(), room);
    }

    public void checkOut(Person person, Room room) {
        person.checkOut(person, room);
        guestRoomMap.remove(room.getRoomID());
    }


    public static void main(String[] args) {
        // Create my person object
        Person myself = new Person();
        myself.setId("1");
        myself.setName("Giorgi");
        myself.setSurname("Giorgadze");

        PersonManager personManager = new PersonManager();
        Person anotherPerson = personManager.getPersons().get(0);

        Room room = new Room();
        room.setRoomID(1);

        HotelManager hotelManager = new HotelManager();

        hotelManager.checkIn(myself, room);

        hotelManager.checkIn(anotherPerson, room);

        hotelManager.displayInfo();
    }
}

