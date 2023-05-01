package Lesson_5.service;

import Lesson_5.model.User;

public interface UserBalance {
    void creditBalance(int index, int money);

    int debitBalance(int index, int money);

    int getBalance(int index);
}
