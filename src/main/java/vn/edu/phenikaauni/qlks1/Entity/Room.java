
package vn.edu.phenikaauni.qlks1.Entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Room {
    private String roomType;
    private String roomNumber;
    private boolean roomStatus;

    public Room(String roomType, String roomNumber, boolean roomStatus) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
    }

    public Room() {
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(boolean roomStatus) {
        this.roomStatus = roomStatus;
    }
    
    
}
