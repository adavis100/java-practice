package com.javapractice.scratch;

import org.assertj.core.groups.Tuple;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Clock;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Scratch {
    /**
     * 2
     * i.like.this.program.very.much
     * pqr.mno
     * rqp.onm
     * mno.pqr
     *
     * @param args
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int testCases = scanner.nextInt();
//        for (int i = 0; i < testCases; i++) {
//            String s = scanner.next();
//
//            System.out.println(removeZeros(s));
//        }
//    }
    public static void main(String[] args) throws IOException, InterruptedException {
        int[] nums = new int[] {1, 2, 3, 4, 5, 2};
        System.out.println(findDuplicate(nums));

        var treeMap = new TreeMap<Integer,List<String>>();
        var heap = new PriorityQueue<Map.Entry<String,Integer>>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        var map = new HashMap<Integer,String>();
    }

    private static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        return nums[slow];
    }

    public static int squareDigits(int n) {
        int total = 0;
        int multiplier = 1;

        while (n > 0) {
            int currentDigit = n % 10;
            int currentSquare = currentDigit * currentDigit;
            total += (currentSquare) * multiplier;
            multiplier *= (currentSquare <= 10 ? 10 : 100);
            n /= 10;
        }
        return total;
    }
}
