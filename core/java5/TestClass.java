

public class TestClass {
    static String msg;

    public static void setMessage(String message) {
        msg = message;
    }

    public static void show() {
        System.out.println("static show() in TestClass !!!");
        System.out.println("Message is " + msg);
    }

    public static void display() {
        System.out.println("static display() in TestClass !!!");
    }
}
