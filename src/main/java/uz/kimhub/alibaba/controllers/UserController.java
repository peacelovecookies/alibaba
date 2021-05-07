package uz.kimhub.alibaba.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.kimhub.alibaba.entities.UserEntity;
import uz.kimhub.alibaba.services.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;


    @GetMapping("all")
    List<UserEntity> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping("save")
    public boolean saveUser(@RequestBody UserEntity entity) {

        return userService.saveUser(entity);
    }


}
