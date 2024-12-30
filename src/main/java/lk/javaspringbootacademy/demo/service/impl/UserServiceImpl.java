package lk.javaspringbootacademy.demo.service.impl;

import lk.javaspringbootacademy.demo.dto.ResponseDTO;
import lk.javaspringbootacademy.demo.dto.UserDTO;
import lk.javaspringbootacademy.demo.entity.User;
import lk.javaspringbootacademy.demo.repository.UserRepository;
import lk.javaspringbootacademy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    private UserRepository userRepository;

@Override
    public ResponseEntity<ResponseDTO> saveUser(UserDTO userDTO){
    User user = new User();
    user.setName(userDTO.getName());
    user.setAge(userDTO.getAge());
    userRepository.save(user);
    return new ResponseEntity<>(ResponseDTO.builder()
            .message("save user successfully")
            .responseCode(HttpStatus.CREATED)
            .build(),HttpStatus.CREATED);

}
}
