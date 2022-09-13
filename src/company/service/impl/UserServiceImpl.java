package company.service.impl;


import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {

  private UserDao userDao;

  public UserServiceImpl(UserDao userDao) {
    this.userDao = userDao;
  }

  public UserDao getUserDao() {
    return userDao;
  }

  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }


  @Override
  public void addUser(User user) {
    userDao.addUser(user);
  }

  @Override
  public void idMenenTabuu(int id) {

    for (int i = 0; i < userDao.getArrayList().size(); i++) {
      if(userDao.getArrayList().get(i).getId() == id) {
        System.out.println(userDao.getArrayList().get(i));
        break;
      }
    }

   try{
     if (id>3)
       throw new RuntimeException();
   } catch (RuntimeException e){
     System.out.println("Id jok");
   }

  }

  @Override
  public void idMenenOchuruu(int id) {
    for (int i = 0; i < userDao.getArrayList().size(); i++) {
      if (userDao.getArrayList().get(i).getId() ==id){
        userDao.getArrayList().remove(i);
        System.out.println("jhfkdjhg");
        break;
      }
    }
  }

  @Override
  public void getUsers() {
    for (User u: userDao.getArrayList()) {
      System.out.println(u.getId());
      System.out.println(u.getAge());
      System.out.println(u.getName());
      System.out.println(u.getGender());
      System.out.println("---------------------");
    }
  }
}
