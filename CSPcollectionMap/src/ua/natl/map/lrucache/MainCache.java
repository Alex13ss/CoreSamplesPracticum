package ua.natl.map.lrucache;

import java.util.Iterator;
import java.util.Map.Entry;

public class MainCache {

    public static void main(String[] args) {

        SimpleLRUCache<Integer, String> lruc = new SimpleLRUCache<>(7);
        lruc.put(7, "aaa");
        lruc.put(6, "bbb");
        lruc.put(5, "ccc");
        lruc.put(4, "ddd");
        lruc.put(3, "eee");
        lruc.put(2, "fff");
        lruc.put(1, "ggg");

        lruc.get(3);
        lruc.get(6);
        lruc.put(8, "hhh");
        lruc.put(9, "iii");

        Iterator<Entry<Integer, String>> iterat = lruc.entrySet().iterator();
        while (iterat.hasNext()) {
            Entry<Integer, String> tmp = iterat.next();
            System.out.println(tmp);
        }

    }

}
