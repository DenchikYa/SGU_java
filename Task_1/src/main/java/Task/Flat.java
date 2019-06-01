package Task;

import java.util.HashSet;
import java.util.Set;

public class Flat {
     Set<Room> rooms = new HashSet<>();

     public Set<Room> getRooms() {
          return rooms;
     }

     public void setRooms(Set<Room> rooms) {
          this.rooms = rooms;
     }

    /*public void addNewRoom(String roomName){
        rooms.add(new Room("Kitchen"));
        rooms.add(new Room("Parlor"));
        rooms.add(new Room("Apartment"));
    }*/
}
