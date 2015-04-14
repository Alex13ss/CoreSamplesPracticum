package ua.natl.map.order;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainElementsOrder {

    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();
        hm.put(7, "aaa");
        hm.put(6, "bbb");
        hm.put(5, "ccc");
        hm.put(4, "ddd");
        hm.put(3, "eee");
        hm.put(2, "fff");
        hm.put(1, "ggg");
        Iterator<Entry<Integer, String>> iterat = hm.entrySet().iterator();
        while (iterat.hasNext()) {
            Entry<Integer, String> tmp = iterat.next();
            System.out.println(tmp);
        }

        System.out.println();

        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(7, "aaa");
        lhm.put(6, "bbb");
        lhm.put(5, "ccc");
        lhm.put(4, "ddd");
        lhm.put(3, "eee");
        lhm.put(2, "fff");
        lhm.put(1, "ggg");
        Iterator<Entry<Integer, String>> iteratl = lhm.entrySet().iterator();
        while (iteratl.hasNext()) {
            Entry<Integer, String> tmpl = iteratl.next();
            System.out.println(tmpl);
        }

    }

}
