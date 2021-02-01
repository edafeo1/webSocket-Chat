package com.fegohuncho.websocket.storage;

import java.util.HashSet;
import java.util.Set;

public class UserStorage  {
    private static UserStorage instance;
    private Set<String> Users;

    private UserStorage() {
        Users = new HashSet<>();
    }

    public static synchronized UserStorage getInstance(){
        if (instance == null){
            instance = new UserStorage();
        }
        return instance;
    }

    public Set<String> getUsers() {
        return Users;
    }

    public void setUsers(Set<String> users) throws Exception {
       if (users.contains(users)){
           throw new Exception("Uer already exist" + users);
       }
       users.add(String.valueOf(users));
    }
}
