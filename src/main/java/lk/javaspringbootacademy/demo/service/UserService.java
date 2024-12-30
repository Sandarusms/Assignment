package lk.javaspringbootacademy.demo.service;

import lk.javaspringbootacademy.demo.dto.ResponseDTO;
import lk.javaspringbootacademy.demo.dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {

    public ResponseEntity<ResponseDTO>saveUser(UserDTO userDTO);
}
