package com.example.HotelCleaning.Repositorys;

import com.example.HotelCleaning.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    
}
