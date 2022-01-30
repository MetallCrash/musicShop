package by.tms.musicshop.service;

import by.tms.musicshop.entity.user.Role;
import by.tms.musicshop.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private UserService userService;

    public void appointStaff(User user) {
        user.getUserDetails().getRoles().add(Role.STAFF);
        userService.saveUser(user);
    }

    public void appointUser(User user) {
        user.getUserDetails().getRoles().add(Role.USER);
        userService.saveUser(user);
    }

    public List<User> getUserList() {
        return userService.findAllUsers();
    }
}
