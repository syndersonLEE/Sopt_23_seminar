package org.sopt.report2.service;

import org.sopt.report2.model.User;
import org.sopt.report2.model.api.DefaultRes;
import java.util.List;

public interface UserService {
    DefaultRes<String> findDate();
    DefaultRes<List<User>> findUser(final String name, final String part);
    DefaultRes<User> findUserIdx(final int userIdx);
    DefaultRes saveUser(final User user);
    DefaultRes<User> updateUser(final int userIdx, final User user);
    DefaultRes deleteUser(final int userIdx);
}
