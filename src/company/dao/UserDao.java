package company.dao;

import company.model.User;

import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> arrayList = new ArrayList<>();

    public UserDao(ArrayList<User> arrayList) {
        this.arrayList = arrayList;
    }

    public UserDao() {
    }

    public ArrayList<User> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<User> arrayList) {
        this.arrayList = arrayList;
    }

    public void addUser(User user){
        arrayList.add(user);
    }

}
