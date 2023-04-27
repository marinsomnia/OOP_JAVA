package Lesson_5.service;

import Lesson_5.model.User;
import Lesson_5.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();

    @Override
    public void saveUser(User user) {
        if (user == null) {
            System.out.println("User is null!");
        }

        userRepository.saveUser(user);
    }
    @Override
    public void removeUser(User user) {
        if (user != null) {
            userRepository.removeUser(user);
        } else {
            System.out.println("User is null!");
        }
    }
    @Override
    public void updateUser(int index, User user) {
        if (user != null) {
            userRepository.updateUser(index, user);
        } else {
            System.out.println("User is null!");
        }
    }
    @Override
    public List<User> getUserList() {
        return userRepository.getUserList();
    }

}
