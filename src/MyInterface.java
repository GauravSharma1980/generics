public interface MyInterface {
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

class NewClass implements MyInterface{

    NewClass newClass = new NewClass();

}