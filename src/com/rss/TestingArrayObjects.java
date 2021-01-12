package com.rss;

import java.util.ArrayList;

public class TestingArrayObjects {
    public static class User{
        int id;
        String name;
        String phone;

        public User(int i, String n, String p){
            this.id = i;
            this.name = n;
            this.phone = p;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }
    }

    // method should return the entire one record when we pass
    // any one of the argument of the object behaviour

    public User getUserByPhone(String phoneNumber, ArrayList<User> userListArray){
        if (userListArray != null) {
            for (User u : userListArray) {
                if (u.getPhone().equalsIgnoreCase(phoneNumber)) {
                    return u;
                }
            }
            return null;
        }
        return null;
    }

    public User getUserByName(String nameUser, ArrayList<User> userListArray){
        if (userListArray != null){
            for (User u : userListArray){
                if (u.getName().equalsIgnoreCase(nameUser)){
                    return u;
                }
            }
            return null;
        }
        return null;
    }

    public User getUserById(String idUser, ArrayList<User> userListArray){
        return null;
    }

    public static void main(String[] args) {
        User youOne = new User(22, "roahn", "(343) 464-3637");
        User youTwo = new User(32, "teja", "(373) 864-3937");
        User youThree = new User(42, "manu", "(443) 664-9637");
        User youFour = new User(52, "rahul", "(243) 064-8637");
        User youFive = new User(62, "roahn", "(643) 434-0037");

        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(youOne);
        userArrayList.add(youTwo);
        userArrayList.add(youThree);
        userArrayList.add(youFour);
        userArrayList.add(youFive);
        userArrayList = null;

        TestingArrayObjects testingTask = new TestingArrayObjects();
        User sixUser = testingTask.getUserByPhone("(443) 664-9637", userArrayList);
        if (sixUser != null){
            System.out.println(" id is "+sixUser.getId());
        } else {
            System.out.println("passed phone number does not match");
        }
    }


}
