package com.javapractice.leetcode;

import java.util.*;

public class WildcardMatch {
    public boolean isMatch(String s, String p) {
        Map<Pair<Integer>,Boolean> memo = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        boolean multipleWildcards = false;
        for (char c : p.toCharArray()) {
            if (c == '*' && !multipleWildcards) {
                sb.append(c);
                multipleWildcards = true;
            } else if (c != '*') {
                sb.append(c);
                multipleWildcards = false;
            }
        }
        p = sb.toString();

        return isMatchHelper(s, p, memo);
    }

    private boolean isMatchHelper(String s, String p, Map<Pair<Integer>,Boolean> memo) {
        Pair<Integer> check = new Pair<>(s.length(), p.length());
        if (memo.containsKey(check)) {
            return memo.get(check);
        }

        boolean match = false;
        if ((s.isEmpty() && p.isEmpty()) || p.equals("*")) {
            match = true;
        } else if (s.length() == 1 && (p.equals(s) || p.equals("?"))) {
            match = true;
        } else if (s.length() > 0 && p.isEmpty()) {
            match = false;
        } else if (s.length() > 0 && p.charAt(0) == '*') {
            match = isMatch(s.substring(1), p.substring(1)) || isMatch(s, p.substring(1)) || isMatch(s.substring(1), p);
        } else if (s.length() > 0 && (p.charAt(0) == '?' || p.charAt(0) == s.charAt(0))) {
            match = isMatch(s.substring(1), p.substring(1));
        }

        memo.put(new Pair<>(s.length(), p.length()), match);
        return match;
    }

    private static class Pair<T> {
        T l;
        T r;

        public Pair(T l, T r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null) {
                return false;
            }
            if (other.getClass() != this.getClass()) {
                return false;
            }

            Pair<?> that = (Pair<?>) other;
            return this.l == that.l && this.r == that.r;
        }

        @Override
        public int hashCode() {
            return Objects.hash(l, r);
        }
    }
}
