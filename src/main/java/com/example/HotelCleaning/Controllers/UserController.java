package com.example.HotelCleaning.Controllers;

import com.example.HotelCleaning.Repositorys.UserRepository;
import com.example.HotelCleaning.Services.UserService;
import com.example.HotelCleaning.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("/user/{username}")
    public User getUserById(@PathVariable String username) {
        return userService.getUser(username);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{username}")
    public void deleteUser(@PathVariable String username) {
        userService.deleteUser(username);
    }
}
