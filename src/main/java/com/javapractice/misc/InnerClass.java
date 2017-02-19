package com.javapractice.misc;

public class InnerClass {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int a;

    private class Inner {
        public void method() {
            System.out.println(a);
        }
    }

    public void inner() {
        Inner inner = new Inner();
        inner.method();
    }

    public static void main(String[] args) {
        InnerClass c = new InnerClass();
        c.setA(100);
        c.inner();
    }
}
