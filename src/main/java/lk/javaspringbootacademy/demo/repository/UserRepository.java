package lk.javaspringbootacademy.demo.repository;

import lk.javaspringbootacademy.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}


