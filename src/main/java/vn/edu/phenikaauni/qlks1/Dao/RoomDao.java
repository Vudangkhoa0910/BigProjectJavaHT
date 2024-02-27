package vn.edu.phenikaauni.qlks1.Dao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import vn.edu.phenikaauni.qlks1.Entity.Room;
import vn.edu.phenikaauni.qlks1.Entity.RoomXML;
import vn.edu.phenikaauni.qlks1.Utils.Utils;

public class RoomDao {
    private static final String ROOM_FILE_NAME = "room.xml";
    
    public static void writeRoomXMl(List<Room> listRoom) {
        RoomXML roomXML = new RoomXML(listRoom);
        Utils.writeXMLtoFile(ROOM_FILE_NAME, roomXML);
    }
    
    public static List<Room> readRoomXML() {
        List<Room> listRoom = new ArrayList<>();

        try {
            // Sử dụng InputStream để đọc từ JAR
            InputStream inputStream = RoomDao.class.getClassLoader().getResourceAsStream(ROOM_FILE_NAME);

            if (inputStream != null) {
                RoomXML roomXML = (RoomXML) Utils.readXMLtoFile(ROOM_FILE_NAME, RoomXML.class);
                listRoom = (roomXML != null) ? roomXML.getListRoom() : new ArrayList<>();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listRoom;
    }
    
    public static void changeRoomStatus(String roomNumber) {
        List<Room> listRoom = readRoomXML();
        for (Room r : listRoom) {
            if (r.getRoomNumber().toString().equals(roomNumber)) {
                r.setRoomStatus(!r.getRoomStatus());
            }
        }
        writeRoomXMl(listRoom);
    }
}
