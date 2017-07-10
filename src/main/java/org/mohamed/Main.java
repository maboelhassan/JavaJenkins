package org.mohamed;


import com.google.gson.Gson;

import java.util.HashMap;

public class Main {
    public static void main(String args[]){
        System.out.println("Hello");
        System.out.println("Hello again");
        User user = new User("mohamed", "mail@mail.com", 12);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);

        UserAddress userAddress = new UserAddress("street", 12, "Alexandria", "Egypt");
        user.address = userAddress;

        user.map = new HashMap<String, String>();
        user.map.put("key1", "val1");
        user.map.put("key2" , "val2");

        //User user1 = gson.fromJson(json, User.class);
        //System.out.println(user1.name+" "+user1.email);

        String json2 = gson.toJson(user);
        System.out.println(json2);


    }
}
