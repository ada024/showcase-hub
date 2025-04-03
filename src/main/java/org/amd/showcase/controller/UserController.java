package org.amd.showcase.controller;



import org.amd.showcase.model.User;
import org.amd.showcase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/")
public class UserController {

    @Autowired
    private UserService service;
    @RequestMapping("register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }
}
