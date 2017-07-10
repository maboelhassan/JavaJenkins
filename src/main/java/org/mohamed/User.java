package org.mohamed;


import java.util.Map;

public class User {
    String name;
    int age;
    String email;
    UserAddress address;

    Map<String, String> map;

    public User(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
