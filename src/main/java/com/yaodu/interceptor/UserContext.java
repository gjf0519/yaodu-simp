package com.yaodu.interceptor;

import com.yaodu.entity.User;

public class UserContext {
    private static final ThreadLocal<User> USER_HODLER = new ThreadLocal<>();

    public static void setUser(User user){
        USER_HODLER.set(user);
    }

    public static void remove(){
        USER_HODLER.remove();
    }

    public static User getUser(){
        return USER_HODLER.get();
    }
}
