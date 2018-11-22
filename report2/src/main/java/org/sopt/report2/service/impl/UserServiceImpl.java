package org.sopt.report2.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.sopt.report2.model.User;
import org.sopt.report2.api.DefaultRes;
import org.sopt.report2.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private static final List<User> userList = new LinkedList<>();

    @Override
    public DefaultRes<String> findDate(){
        long curr = System.currentTimeMillis();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy:MM:dd-hh:mm:ss");
        String datetime2 = sdf2.format(new Date(curr));
        return DefaultRes.res(HttpStatus.OK.value(), "현재 시각", datetime2);
    }

    @Override
    public DefaultRes<List<User>> findUser(final String name, final String part){
        if(name.equals("null") && part.equals("null")){ //syntax없이 userList가 비어있을 경우
            if(userList.isEmpty()) {
                return DefaultRes.res(HttpStatus.NOT_FOUND.value(),"없습니다(빈 리스트)");
            }
            else{
                return DefaultRes.res(HttpStatus.OK.value(),"모든 회원 데이터 반환",userList);
            }
        }

        else {
            final List<User> tempList = new LinkedList<>();
            if(part.equals("null")){ //name값만 입력 받았을 경우
                for(final User s :userList){
                    if(s.getName().equals(name)) {
                        tempList.add(s);
                    }
                }
                return DefaultRes.res(HttpStatus.OK.value(),"이름으로 조회",tempList);
            }
            else if(name.equals("null")){ //part만 입력
                for(final User s :userList){
                    if(s.getPart().equals(part)) {
                        tempList.add(s);
                    }
                }
                return DefaultRes.res(HttpStatus.OK.value(),"파트로 조회",tempList);
            }
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(),"없습니다(조회 실패)");
        }
    }

    @Override
    public DefaultRes<User> findUserIdx(final int userIdx){
        for(final User s : userList){
            if(s.getUserIdx() == userIdx){
                return DefaultRes.res(HttpStatus.OK.value(), "인덱스로 조회", s);
            }
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "없습니다(조회 실패)");
    }

    @Override
    public DefaultRes saveUser(final User user){
        userList.add(user);
        return DefaultRes.res(HttpStatus.OK.value(), "회원 저장");
    }

    @Override
    public DefaultRes<User> updateUser(final int userIdx, final User user){
        for(final User s : userList){
            if(s.getUserIdx() == userIdx){
                s.setUserIdx(user.getUserIdx());
                if(user.getName() != "NULL"){
                    s.setName(user.getName());
                }
                if(user.getPart() != "NULL"){
                    s.setPart(user.getPart());
                }
                return DefaultRes.res(HttpStatus.OK.value(), "인덱스로 조회", s);
            }
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "없습니다(조회 실패)");
    }

    @Override
    public DefaultRes deleteUser(final int userIdx){
        for(final User s : userList){
            if(s.getUserIdx() == userIdx) {
                userList.remove(s);
                return DefaultRes.res(HttpStatus.OK.value(), "삭제 완료");
            }
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "없습니다(조회 실패)");
    }

}
