package inheritance;

public class Apple extends Fruit {
    public Apple(String fruitName) {
    }

    public static void main(String[] args){
        new Apple("Apple");
    }
}

class Fruit {
    public Fruit()
    {
    }
    public Fruit(String name) {
        System.out.println(name);
    }
}

