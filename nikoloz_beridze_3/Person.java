package quizes.q3.nikoloz_beridze_3;

public class Person {

    String id;
    String name, surname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void checkIn(Person person, Room room) {
        // Add the person to the room
        room.checkIn(person);
    }


    public void checkOut(Person person, Room room) {
        // Remove the person from the room
        room.checkOut(person);
    }
}
