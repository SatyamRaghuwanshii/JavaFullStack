package Generics;

import java.nio.file.FileStore;

public class BoundsInGenerics {
    static void main(String[] args) {
        number<Integer> abc = new number<>();
        abc.value = 10;
        System.out.println(abc.getDouble());;
        
        mc<fish> f = new mc<>();
    }
    public static class number<T extends Number>{ //T is generic but upper bounded by Number class
        T value;
        public double getDouble(){
           return value.doubleValue();
        }
    }
}

class mc<T extends Animal & swim>{
    T value;
}

class Animal{
    void display(){
        System.out.println("diplaying");
    }
}
interface swim{
    void swimming();
}
class dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}
class fish extends Animal implements swim{
    void psps(){
        System.out.println("fish psps");
    }

    @Override
    public void swimming() {
        System.out.println("fish Swims");
    }
}
