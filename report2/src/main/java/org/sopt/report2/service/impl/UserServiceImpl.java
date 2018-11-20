package org.sopt.report2.service.impl;

import org.sopt.report2.model.User;
import org.sopt.report2.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserServiceImpl implements UserService {
    private final static List<User> userList = new LinkedList<>();

    @Override
    @GetMapping("")
    public String getCurrentTime(){
        long curr = System.currentTimeMillis();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy:MM:dd-hh:mm:ss");
        String datetime2 = sdf2.format(new Date(curr));
        return datetime2;
    }

    @Override
    @GetMapping("/users")
    public String findUser(@RequestParam(value = "name", defaultValue = "null") final String name,
                           @RequestParam(value = "part", defaultValue = "null") final String part) {
        if(name.equals("null") && part.equals("null")){
            if(userList.isEmpty()) {
                return "없습니다";
            }
            else{
                String str = new String();
                for(final User s :userList){
                    str += s.toString();
                }
                return str;
            }
        }
        else {
            String str = new String();
            if(part.equals("null")){
                for(final User s :userList){
                    if(s.getName().equals(name)) {
                        str += s.toString();
                    }
                }
            }
            else if(name.equals("null")){
                for(final User s :userList){
                    if(s.getPart().equals(part)) {
                        str += s.toString();
                    }
                }
            }
            if(str.isEmpty()){
                return "없습니다";
            }
            else{
                for(final User s :userList){
                    if(s.getPart() == part && s.getName() == name) {
                        str += s.toString();
                    }
                }
            }
            return str;
        }
    }

    @Override
    @GetMapping("/users/{user_idx}")
    public String findUserIdx(@PathVariable(value = "user_idx") final int userIdx){
        String str = new String();
        for(final User s : userList){
            if(s.getUserIdx() == userIdx){
                str += s.toString();
                return str;
            }
        }
        return "없습니다";
    }

    @Override
    @PostMapping("/users")
    public String saveUser(@RequestBody final User user){
        userList.add(user);
        return "회원 저장";
    }


    @Override
    @PutMapping("/users/{user_idx}")
    public String updateUser(@PathVariable(value = "user_idx") final int userIdx,
                             @RequestBody final User user){
        for(final User s : userList){
            if(s.getUserIdx() == userIdx) {
                s.setUserIdx(user.getUserIdx());
                s.setName(user.getName());
                s.setPart(user.getPart());
                return "회원 수정 완료";
            }
        }
        return "해당 유저 없음";
    }

    @Override
    @DeleteMapping("users/{user_idx}")
    public String deleteUser(@PathVariable(value = "user_idx") final int userIdx){
        for(final User s : userList){
            if(s.getUserIdx() == userIdx) {
                userList.remove(s);
                return "회원 수정 완료";
            }
        }
        return "해당 유저 없음";
    }

}
