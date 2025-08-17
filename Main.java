package Java5;
public class Main {
    public Main(){
        System.out.println("This is a default constructore !!!");
    }
    @SuppressWarnings("unused")
    public static void main (String []a){
        Main main=new Main("John");
    }

    public Main(String name ){
        System.out.println("My name is "+name);
    }
}
