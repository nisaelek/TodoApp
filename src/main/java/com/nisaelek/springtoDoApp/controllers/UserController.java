package com.nisaelek.springtoDoApp.controllers;

import com.nisaelek.springtoDoApp.entities.User;
import com.nisaelek.springtoDoApp.repos.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
        //@Autowired kullanmak yerine ya da newlemek yerine böyle kullanılabilir.
    }

    @GetMapping
    public List<User> getAllUsers() {
      return  userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser){
        //requestbodydeki bilgileri alıp User objesine maple ve newUser ı dön
        return userRepository.save(newUser);
    }

    @GetMapping("/{userId}")
    public User getOneUser(@PathVariable Integer userId){
        //custom exception
        return userRepository.findById(userId).orElse(null);

    }
    @PutMapping("/{userId}")
    public User updateOneUser(@PathVariable Integer userId,@RequestBody User newUser) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            User foundUser = user.get();
            foundUser.setName(newUser.getName());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        } else {
            return null;
        }
    }
    @DeleteMapping("/{userId}")
        public void deleteOneUser(@PathVariable Integer userId){
          userRepository.deleteById(userId);
        }
    }




