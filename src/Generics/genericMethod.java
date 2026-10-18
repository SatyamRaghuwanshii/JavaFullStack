package Generics;

public class genericMethod {
    static void main(String[] args) {
        Integer a = getValue(10);
        String b = getValue("hello");

        System.out.println(a + " " + b);
    }
    public static <T> T getValue(T x){ //<generic> returnType name(genric Parameter){ }
        return x;
    }
}
