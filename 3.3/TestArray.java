import java.util.Scanner;
/**
 * 这个例子说明了，java中声明数组时，是可以使用size这种变量的，不需要是个final
 */
public class TestArray{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int size=scan.nextInt();
		int[] counts=new int[4];
		double[] values=new double[size];
		for(int i=0;i<size;i++){
			values[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.println(values[i]);
		}
	}
}
