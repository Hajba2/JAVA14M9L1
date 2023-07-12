package collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("iva");
        set.add("iva");
        set.add("iva");
        set.add("iva");
        set.add("iva2");

        System.out.println("set.size() = " + set.size());

        for (String s : set) {
            System.out.println("s = " + s);
        }
    }
}
