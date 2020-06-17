package com.example.HotelCleaning.Services;

import com.example.HotelCleaning.Repositorys.UserRepository;
import com.example.HotelCleaning.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        List<User> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);
        return user;
    }

    public User getUser(String userName) {
        return userRepository.findById(userName).orElse(new User());
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(String userName) {
        userRepository.deleteById(userName);
    }
}
