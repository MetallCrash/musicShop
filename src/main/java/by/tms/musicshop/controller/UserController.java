package by.tms.musicshop.controller;

import by.tms.musicshop.entity.user.User;
import by.tms.musicshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String userRegistrationPage(Model model) {
        model.addAttribute("newUser", new User());
        return "/registration";
    }

    @PostMapping("/reg")
    public String userRegistrationPage(@ModelAttribute("newUser") @Valid User user,
                                       BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "/registration";
        } else {
            if (userService.isUserSaved(user)) {
                userService.saveUser(user);
                return "index";
            } else {
                model.addAttribute("emailExistMessage", "This email is already exist.");
            }
        }
        return "/registration";
    }

    @GetMapping("/log_in")
    public String login() {
        return "log_in";
    }
}
