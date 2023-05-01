package Lesson_5.controller;

import Lesson_5.model.User;
import Lesson_5.service.UserService;
import Lesson_5.service.UserServiceImpl;

import java.util.List;

public class UserController {

    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, int age) {
        userService.saveUser(new User(name, age));
    }

    public void removeUser(User user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }
}
