package ua.natl.map.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class MainWHM {

    public static void main(String[] args) {

        Map<Data, String> whm = new WeakHashMap<>();

        Data data = new Data();
        whm.put(data, "Our data");

        data = null;
        System.gc();

        for (int i = 1; i < 10000; i++) {
            // System.out.println(i);
            if (whm.isEmpty()) {
                System.out.println("Our WeakHashMap is empty!");
                break;
            }
        }

    }

}
