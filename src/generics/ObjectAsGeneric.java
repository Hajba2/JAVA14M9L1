package generics;

public class ObjectAsGeneric {

    public static Double add(Object a, Object b) {
        if (a instanceof Number && b instanceof Number) {
            Number ad = (Number) a;
            Number bd = (Number) b;
            return ad.doubleValue() + bd.doubleValue();
        }
        return 0d;
    }

}
