package Generics;

public class generics {
    static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10); //<Integer> type argument
        Box<String> b2 = new Box<>("Hello ");

        System.out.println(b1.getValue() + 5);
        System.out.println(b2.getValue() + 5);
    }
}

class Box<T>{ //<T> type parameter
    private T value; //T is generic data type

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
