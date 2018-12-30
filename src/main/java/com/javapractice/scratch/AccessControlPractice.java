package com.javapractice.scratch;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class AccessControlPractice {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getSecurityManager());
        System.setSecurityManager(new SecurityManager());
        AccessController.doPrivileged((PrivilegedAction<Boolean>)()-> {
            System.out.println(System.getProperty("java.home"));
            return Boolean.TRUE;
        });
    }
}
