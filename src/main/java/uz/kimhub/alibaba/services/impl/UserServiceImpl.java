package uz.kimhub.alibaba.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.kimhub.alibaba.entities.UserEntity;
import uz.kimhub.alibaba.repositories.UserRepository;
import uz.kimhub.alibaba.services.UserService;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    @Transactional(readOnly = true)
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public boolean saveUser(UserEntity entity) {
        if (entity != null) {
            userRepository.save(entity);
            return true;
        }
        return false;
    }
}
