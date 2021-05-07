package uz.kimhub.alibaba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.kimhub.alibaba.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
