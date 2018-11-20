package org.sopt.report2.service;

import org.sopt.report2.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public String getCurrentTime();
    public String findUser(final String name, final String part);
    public String findUserIdx(final int userIdx);
    public String saveUser(final User user);
    public String updateUser(final int userIdx, final User user);
    public String deleteUser(final int userIdx);
}
