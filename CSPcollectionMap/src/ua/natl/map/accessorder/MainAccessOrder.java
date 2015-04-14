package ua.natl.map.accessorder;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainAccessOrder {

    public static void main(String[] args) {

        Map<Integer, String> lhm = new LinkedHashMap<>(7, 1, true);
        lhm.put(7, "aaa");
        lhm.put(6, "bbb");
        lhm.put(5, "ccc");
        lhm.put(4, "ddd");
        lhm.put(3, "eee");
        lhm.put(2, "fff");
        lhm.put(1, "ggg");

        lhm.get(3);
        lhm.get(6);
        lhm.get(1);

        Iterator<Entry<Integer, String>> iterat = lhm.entrySet().iterator();
        while (iterat.hasNext()) {
            Entry<Integer, String> tmp = iterat.next();
            System.out.println(tmp);
        }

    }

}
