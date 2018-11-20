package org.sopt.report2.model.api;

import lombok.extern.slf4j.Slf4j;
import org.sopt.report2.model.User;
import org.sopt.report2.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {

    private final UserService userService;

    public  UserController(final UserService userService){
        this.userService = userService;
    }
    @GetMapping("")
    public ResponseEntity findCurrentDate(){
        log.info("시간 검색 컨트롤러 호출");
        return new ResponseEntity<>(userService.findDate(), HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity findUser(@RequestParam(value = "name", defaultValue = "null") final String name,
                           @RequestParam(value = "part", defaultValue = "null") final String part) {
        log.info("이름 파트로 검색 컨트롤러 호출");
        return new ResponseEntity<>(userService.findUser(name, part), HttpStatus.OK);
    }

    @GetMapping("/users/{user_idx}")
    public ResponseEntity findUserIdx(@PathVariable(value = "user_idx") final int userIdx){
        log.info("인덱스 숫자로 검색 컨트롤러 호출");
        return new ResponseEntity<>(userService.findUserIdx(userIdx), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity saveUser(@RequestBody final User user){
        log.info("삽입 컨트롤러 호출");
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }


    @PutMapping("/users/{user_idx}")
    public ResponseEntity updateUser(@PathVariable(value = "user_idx") final int userIdx,
                             @RequestBody final User user){
        log.info("수정 컨트롤러 호출");
        return new ResponseEntity<>(userService.updateUser(userIdx, user), HttpStatus.OK);
    }

    @DeleteMapping("users/{user_idx}")
    public ResponseEntity deleteUser(@PathVariable(value = "user_idx") final int userIdx){
        log.info("삭제 컨트롤러 호출");
        return new ResponseEntity<>(userService.deleteUser(userIdx), HttpStatus.OK);
    }
}
