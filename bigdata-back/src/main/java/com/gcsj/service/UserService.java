package com.gcsj.service;

import com.gcsj.pojo.User;
import com.gcsj.vo.PageRequest;
import com.gcsj.vo.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {

    int addUser(User user);

    Object login(User user);

    List<User> getUserList(User user);

    User getUserByName(String nickname);

    int deleteUserById(Integer id);

	User getUserById(Integer id);
	
    int Logout(Integer id);

    int relive(Integer id);

	int updateAvatar(User user);

    PageResult listUser(PageRequest pageRequest);//

    PageResult selectUserListBy(PageRequest pageRequest, User user);

    int updateUserById(User user);

    User selectUserByMail(String  mail);

    int checkByEmail(String mail);
}
