package Learning;

import java.util.ArrayList;
import java.util.List;

public class Main {

    int id = 0;
    List<User> list = new ArrayList<>();


    public static void main(String[] args) {
        Main m = new Main();

        m.addUser("abc@gmail.com", 1234, "abc", "M");
        m.addUser("xyz@gmail.com", 7890, "xyz", "F");



        System.out.println("*******Get all users*******");
        m.getUsers();

        // get user
        int idx = 1;
        System.out.println("*******Get user of id: " +  idx + " *******");
        System.out.println(m.getUserById(idx));

        String newName1 = "pqr";
        System.out.println("*******Update user name of id: " +  idx + " with name: " + newName1  + " *******");
        m.updateUserName(1, newName1);

        String newName2 = "stu";
        System.out.println("*******Update user name of id: " +  idx + " with name: " + newName2  + " *******");
        m.updateUserName(1, newName2);

        System.out.println("*******Get user of id: " +  idx + " *******");
        System.out.println(m.getUserById(idx));

        // delete
        System.out.println("*******Delete user of id: " +  idx + " *******");
        m.deleteUser(idx);

        System.out.println("*******Get user of id: " +  idx + " *******");
        System.out.println(m.getUserById(idx));
    }

    // create
    public void addUser(String email, int phone, String name, String gender) {
        id++;

        // start
       // User user = new User(id, email, phone, name, true);

        User user = new User();
        user.isActive = true;
        user.setPhone(phone);
        user.setGender(gender);
        user.setName(name);
        user.setEmail(email);


        list.add(user);
    }

    // read
    public void getUsers() {
        // print all users
//        for (int i = 0; i <= list.size(); i++) {
//            User user = list.get(i);
//            System.out.println(user);
//        }
        for (User user : list) {
            System.out.println(user);
        }
    }

    public User getUserById(int id) {
        // return null, if no user
        for (User user : list) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

    // delete
    public void deleteUser(int id) {
        for (User user :list){
            if (user.id ==id) {
                list.remove(user);
            }
        }
    }

    // update
    public void updateUserName(int id, String name) {
        for (User user :list){
            if (user.id == id) {
                user.name = name;
            }
        }
    }


}
