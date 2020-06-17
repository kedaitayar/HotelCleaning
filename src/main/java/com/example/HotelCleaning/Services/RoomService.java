package com.example.HotelCleaning.Services;

import com.example.HotelCleaning.Repositorys.RoomRepository;
import com.example.HotelCleaning.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRoom() {
        List<Room> room = new ArrayList<>();
        roomRepository.findAll().forEach(room::add);
        return room;
    }

    public Room getRoom(Long roomId) {
        return roomRepository.findById(roomId).orElse(new Room());
    }

    public void addRoom(Room room) {
        roomRepository.save(room);
    }

    public void updateRoom(Room room) {
        roomRepository.save(room);
    }

    public void deleteRoom(Long roomId) {
        roomRepository.deleteById(roomId);
    }

    public List<Room> getAllRoomByRoomStatus(String roomStatus) {
        List<Room> room = new ArrayList<>();
        roomRepository.findByRoomStatus(roomStatus).forEach(room::add);
        return room;
    }
}
