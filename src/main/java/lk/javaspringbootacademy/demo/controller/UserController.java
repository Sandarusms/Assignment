package lk.javaspringbootacademy.demo.controller;


import lk.javaspringbootacademy.demo.dto.ResponseDTO;
import lk.javaspringbootacademy.demo.dto.UserDTO;
import lk.javaspringbootacademy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/user")
@CrossOrigin
@RestController
public class UserController {

@Autowired
private UserService userService;

@PostMapping("/save")
public ResponseEntity<ResponseDTO> saveUsers(@RequestBody UserDTO userDTO) {
    return userService.saveUser(userDTO);
}

}
