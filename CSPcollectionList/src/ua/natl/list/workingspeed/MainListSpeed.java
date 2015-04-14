package ua.natl.list.workingspeed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainListSpeed {
    public static void main(String[] args) {

        final int MAX = 100000;
        long startTime = 0;

        startTime = System.nanoTime();
        ArrayList<Integer> al = new ArrayList<Integer>(MAX);
        for (int i = 0; i < MAX; i++)
            al.add(i);
        System.out.println("AL add = " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < MAX; i++)
            ll.add(i);
        System.out.println("LL add = " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            al.add(MAX / 2, i);
        }
        System.out.println("AL expand = " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            ListIterator<Integer> it = ll.listIterator(MAX / 2);
            it.add(new Integer(i));
        }
        System.out.println("LL expand = " + (System.nanoTime() - startTime));

    }

}
