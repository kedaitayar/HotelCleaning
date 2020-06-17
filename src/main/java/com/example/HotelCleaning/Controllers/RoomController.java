package com.example.HotelCleaning.Controllers;

import com.example.HotelCleaning.Services.RoomService;
import com.example.HotelCleaning.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomservice;

    @RequestMapping("/room")
    public List<Room> getAllRoom() {
        return roomservice.getAllRoom();
    }

    @RequestMapping("/room/{roomId}")
    public Room getRoomId(@PathVariable Long roomId) {
        return roomservice.getRoom(roomId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/room")
    public void addRoom(@RequestBody Room room) {
        roomservice.addRoom(room);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/room")
    public void updateRoom(@RequestBody Room room) {
        roomservice.updateRoom(room);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/room/{roomId}")
    public void deleteRoom(@PathVariable Long roomId) {
        roomservice.deleteRoom(roomId);
    }

}
