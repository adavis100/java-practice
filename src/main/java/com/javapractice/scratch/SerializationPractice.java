package com.javapractice.scratch;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
        for (int i = 0; i < 10000; i++) {
            list.add(Integer.toString(i));
        }
        System.out.println(list);

        writeList(list, "/tmp/list.ser");

        MyList<String> newList = readList("/tmp/list.ser");
        System.out.println(newList);
    }

    private static<T> void writeList(MyList<T> list,  String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static<T> MyList<T> readList(String fileName) {
        MyList<T> list = null;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            list = (MyList<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}

class MyList<T> implements Serializable {
    private transient int size = 0;
    private transient Entry head = null;

    private static class Entry<T> {
        T item;
        Entry next;
    }

    public void add(T item) {
        if(head == null) {
            head = new Entry<>();
            head.item = item;
        } else {
            Entry current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            current.next = new Entry<>();
            current.next.item = item;
        }
        size++;
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();

        os.writeInt(size);
        for (Entry e = head; e != null; e = e.next) {
            os.writeObject(e.item);
        }
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject();

        int elements = is.readInt();
        for (int i = 0; i < elements; i++) {
            add((T) is.readObject());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Entry current = head;
        for (int i = 0; i < size; i++) {
            sb.append(current.item);
            if (i < size - 1)
                sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
