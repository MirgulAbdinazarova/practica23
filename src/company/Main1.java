package company;

import company.dao.UserDao;
import company.enums.Gender;
import company.model.User;
import company.service.impl.UserServiceImpl;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

       User user1=new User(1,"Nazar",19,Gender.MALE);
       User user2=new User(2,"Nargiza",17,Gender.FEMALE);
       User user3=new User(3,"Asan",18,Gender.MALE);
        UserDao userDao=new UserDao();

        UserServiceImpl userService=new UserServiceImpl(userDao);
       userService.addUser(user1);
       userService.addUser(user2);
       userService.addUser(user3);
        userService.idMenenTabuu(6);
        userService.getUsers();
    }
}
