package com.javapractice.misc;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Scratch {
    public static void main(String[] args) throws IOException {
//        File dir = new File("src/javapractice");
//        for (String fname : dir.list((f, name) -> name.endsWith(".java"))) {
//            System.out.println(fname);
//        }
//
//        Path path = Paths.get("src/javapractice");
//        Files.list(path).filter(p -> p.toString().endsWith("java")).forEach(System.out::println);
//
////        Proxy proxy = Proxy.newProxyInstance()
//        Map<String, String> map = new HashMap<>();
//        map.put("1", "2");
//        map.put("2", "2");
//        map.put("3", "3");
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        for(;iterator.hasNext();) {
//            Map.Entry<String,String> entry = iterator.next();
//            System.out.println(entry);
//            iterator.remove();
//        }
////        map.keySet().forEach(map::remove);
//        System.out.println(map);


//        int []arr = new int[10];
//        for (int i = 1; i < 100000; i++) {
//            arr = new int[i];
//            arr[0] = 1;
//        }
//        System.out.println(arr[0]);
//
//
//        List<GarbageCollectorMXBean> list = ManagementFactory.getGarbageCollectorMXBeans();
//        for (GarbageCollectorMXBean bean : list) {
//            System.out.println("Name: " + bean.getName());
//            System.out.println("Collection count: " + bean.getCollectionCount());
//            System.out.println("Collection time: " + bean.getCollectionTime());
//        }

        System.out.println(repeatedSubstringPattern("aabaaba"));
    }


    public static boolean repeatedSubstringPattern(String str) {
        for (int i = 1; i <= str.length()/2; i++) {
            String sub = str.substring(0, i);
            boolean found = true;
            for (int j = i; j < str.length(); j += i) {
                if (j+i > str.length() || !str.substring(j, j + i).equals(sub)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }
}
