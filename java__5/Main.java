package java__5;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String []args){
        Main main=new Main("John");
    }
    public Main(){
        System.out.println("Main Constructor !!!");
    }
    public Main(String name){
        System.out.println("My name is "+name);
    }
}
