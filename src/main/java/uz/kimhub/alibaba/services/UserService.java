package uz.kimhub.alibaba.services;

import uz.kimhub.alibaba.entities.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUser();


    boolean saveUser(UserEntity entity);
}
