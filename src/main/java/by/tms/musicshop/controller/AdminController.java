package by.tms.musicshop.controller;

import by.tms.musicshop.entity.user.Role;
import by.tms.musicshop.entity.user.User;
import by.tms.musicshop.service.AdminService;
import by.tms.musicshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String showUserList(Model model) {
        List<User> userList = adminService.getUserList();
        model.addAttribute("userList", userList);
        return "/admin";
    }

    @PostMapping()
    public String appointRole(@RequestParam("email") String email) {
        User user = userService.findUserByEmail(email);
        if (user.getUserDetails().getRoles().contains(Role.STAFF)) {
            adminService.appointUser(user);
        } else if (!user.getUserDetails().getRoles().contains(Role.STAFF)) {
            adminService.appointStaff(user);
        }
        return "redirect:/admin";
    }

    @PostMapping("/user")
    public String findUser(@RequestParam String email, Model model) {
        User user = userService.findUserByEmail(email);
        model.addAttribute("user", user);
        return "/admin";
    }
}
