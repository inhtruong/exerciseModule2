package MethodArrayLib;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
        System.out.println("Khoi tao thanh cong!");
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
            System.out.println("Khoi tao thanh cong!");
        } else {
            System.out.println("Passed parameter error!!");
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
    }

    public void add (int index, E e) {
        if (index > size()) {
            throw new IllegalArgumentException("index: " + index);
        } else if (index + 1 == size()) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            size++;
            elements[index] = e;
        } else {
            if (size() == elements.length) {
                ensureCapacity(1);
            }
        }
    }

    public E remove (int index) {
        // check index
        checIndex(index);

        // gan phan tu can xoa trong mang Linked cho bien e
        E e = (E) elements[index];

        // chuyen phan tu thu index + 1 sang index
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        //phan tu cuoi cung idex - 1 bang null
        elements[index - 1] = null;

        // Giam size di 1
        size--;
        return e;

    }

    public int size() {
        return size;
    }

//    public E clone() throws CloneNotSupportedException {
//        ArrayList<E> v = (ArrayList<E>) super.clone();
//        v.elements = Arrays.copyOf(elements,size);
//        v.size = size;
//
//    }

    public boolean contain (E o) {
        // tao vong lap kiem tra o co trong Linked
        for (int i = 0; i < elements.length; i++) {
            if(o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf (E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add (E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity (int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
            System.out.println("Khoi tao thanh cong voi kich thuoc: " + elements.length);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public E get(int index) {
        checIndex(index);
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void checIndex(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }


}
