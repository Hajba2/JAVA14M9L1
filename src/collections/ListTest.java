package collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("one");
        list.add("love");

        list.addAll(2, new ArrayList<>() {{
            add("Hola");
            add("from");
            add("me");
            add("love");
        }});

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("=================");
        System.out.println("=================");
        System.out.println("=================");

        list.remove(0);
        System.out.println("list.indexOf(\"love\") = " + list.indexOf("love"));
        System.out.println("list.lastIndexOf(\"love\") = " + list.lastIndexOf("love"));
        list.remove("love");


        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("list.containsAll(new ArrayList<>() {{\n            add(\"Hola\");\n            add(\"from\");\n        }}) = " + list.containsAll(new ArrayList<>() {{
            add("Hola");
            add("from");
        }}));


    }
}
