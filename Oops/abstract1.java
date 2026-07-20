public class abstract1 {

    public static void main(String args[]) {

        hen h1 = new hen();
        h1.eat();
    }
}

abstract class animal {
    String color;

    void colour() {
        color = "Brown";
    }

    animal() { // default constructor
        System.out.println("Super class called");
    }

    abstract void Run();

    abstract void eat();
}

class lion extends animal {

    lion() {
        System.out.println("Lion class called");
    }

    @Override
    void Run() {// recreat the function
        System.out.println("Lion can 400mph");
    }

    @Override
    void eat() {// recreat the function
        System.out.println("Lion can any meat");
    }
}

class hen extends lion {
    hen() {
        System.out.println("hen class called");
    }

    @Override
    void Run() {// recreat the function
        System.out.println("hen can 50mph");
    }

    @Override
    void eat() {// recreat the function
        System.out.println("hen can any meat");
    }
}
