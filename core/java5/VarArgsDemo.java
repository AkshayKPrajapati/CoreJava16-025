public class VarArgsDemo {
    void add(int a, int b,int... c){
        int result=a+b;
        for(int num: c){
            result+=num;
        }
        System.out.println("Adddition Result is : "+result);
    }
    public static void main(String[] args) {
        System.out.println("Start the programe");
        VarArgsDemo demo=new VarArgsDemo();
        try {
            demo.add(10, 20);
            demo.add(10, 20,30);
            demo.add(10, 20,30,40,50);
        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}
