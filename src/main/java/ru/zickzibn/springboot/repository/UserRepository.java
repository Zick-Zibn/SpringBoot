package ru.zickzibn.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zickzibn.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
