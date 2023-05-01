package Lesson_5.view;

import Lesson_5.controller.BalanceController;
import Lesson_5.controller.UserController;
import Lesson_5.model.User;
import Lesson_5.repository.UserRepository;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
// Добавить операции удаления, изменения и вывода пользователей
//Реализовать систему работы банковского приложения.
//-Создать класс пользователь и соответсвующие классы
//-Реализовать операции зачисления средств пользователю на счет и списания(У пользователя
//должно быть отдельное поле - его балланс)
//-Реализовать функции добавления и удаления пользователя

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();

        userController.saveUser("Михаил", 28);
        userController.saveUser("Андрей", 37);
        userController.saveUser("Анна", 55);
        userController.saveUser("Юлия", 43);


        BalanceController balanceController = new BalanceController();
        balanceController.creditBalance(0, 15000);//начисление
        balanceController.creditBalance(1, 5000);
        balanceController.creditBalance(2, 55000);
        balanceController.creditBalance(3, 10000);

        balanceController.debitBalance(1, 6000);//снятие
        balanceController.debitBalance(2, 20000);

        int index = 0;
        for (User user : userController.getUserList()) {
            System.out.printf("Index of person in the list: %d %s\n", index, user);
            index++;
        }

        userController.removeUser(userController.getUserList().get(1));
        int i = 0;
        for (User user : userController.getUserList()) {
            System.out.printf("Index of person in the list: %d %s\n", i, user);
            i++;
        }
    }
}
