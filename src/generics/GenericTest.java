package generics;

public class GenericTest {

    public static void main(String[] args) {
        //noGenericTest();
        objectAsGenericTest();
        //genericAsGenericTest();
    }

    public static void genericAsGenericTest() {
        System.out.println("GenericsExample.add(Double.valueOf(1), Double.valueOf(3)) = " + new GenericsExample().add(Double.valueOf(1), Double.valueOf(3)));
        System.out.println("GenericsExample.add(Integer.valueOf(1), Integer.valueOf(3)) = " + new GenericsExample().add(Integer.valueOf(1), Double.valueOf(3)));
        //GenericsExample.add(new Object(), Integer.valueOf(3));
    }

    public static void objectAsGenericTest() {
        System.out.println("ObjectAsGeneric.add(Double.valueOf(1), Double.valueOf(2)) = " +
                ObjectAsGeneric.add(Double.valueOf(1), Double.valueOf(2)));
        System.out.println("ObjectAsGeneric.add(Integer.valueOf(1), Double.valueOf(2)) = " +
                ObjectAsGeneric.add(Integer.valueOf(1), Double.valueOf(2)));
        System.out.println("ObjectAsGeneric.add(\"as\", \"as\") = " +
                ObjectAsGeneric.add("as", "as"));
    }

    public static void noGenericTest() {
        System.out.println("NoGenerics.add(1, 1) = " + NoGenerics.add(1, 1));
        System.out.println("NoGenerics.add(1d, 1d) = " + NoGenerics.add(1d, 1d));
        System.out.println("NoGenerics.add(1l, 1l) = " + NoGenerics.add(1l, 1l));
    }
}



















