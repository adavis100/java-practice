package com.javapractice.misc;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaders {
    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("file:///Users/awa/projects/scratch/vaadin-test/target/rzfemgmt-classes.jar");
            URLClassLoader classLoader = new URLClassLoader(new URL[] {url});
            Class clazz = classLoader.loadClass("com.javapractice.misc.ClassLoaders");
            Object o = clazz.newInstance();
            System.out.println(o.toString());
        } catch (MalformedURLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
