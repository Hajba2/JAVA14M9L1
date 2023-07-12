package generics;

public class GenericsExample <T extends Number> {

    // T -> any type

    public Double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

}
