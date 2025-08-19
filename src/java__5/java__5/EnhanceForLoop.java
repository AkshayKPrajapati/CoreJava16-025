public class EnhanceForLoop{
	public static void main(String [] a){
		int []arr={12,34,45,56,78};
		for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int val  : arr){
            System.out.print(val+" ");
        }
        System.out.println();
        String [] str={"hello","Hey","Bye","Welcome"};
        for(String string: str ){
            System.out.print(string+" , ");
        }
	}
}