
package vn.edu.phenikaauni.qlks1.Entity;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RoomXML {
    private List<Room> roomXML;

    public RoomXML() {
    }

    public RoomXML(List<Room> roomXML) {
        this.roomXML = roomXML;
    }

    public List<Room> getListRoom() {
        return roomXML;
    }

    public void setListRoom(List<Room> roomXML) {
        this.roomXML = roomXML;
    }
    
}
