package com.example.HotelCleaning.Repositorys;

import com.example.HotelCleaning.models.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomRepository extends CrudRepository<Room, Long> {
    public List<Room> findByRoomStatus(String roomStatus);
}
