package com.example.HotelCleaning.Controllers;

import com.example.HotelCleaning.Services.RoomService;
import com.example.HotelCleaning.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping("/room")
    public List<Room> getAllRoom() {
        return roomService.getAllRoom();
    }

    @RequestMapping("/room/{roomId}")
    public Room getRoomById(@PathVariable Long roomId) {
        return roomService.getRoom(roomId);
    }

    @RequestMapping("/room/status/{roomStatus}")
    public List<Room> getRoomByRoomStatus(@PathVariable String roomStatus) {
        return roomService.getAllRoomByRoomStatus(roomStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/room")
    public void addRoom(@RequestBody Room room) {
        roomService.addRoom(room);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/room")
    public void updateRoom(@RequestBody Room room) {
        roomService.updateRoom(room);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/room/{roomId}")
    public void deleteRoom(@PathVariable Long roomId) {
        roomService.deleteRoom(roomId);
    }

}
