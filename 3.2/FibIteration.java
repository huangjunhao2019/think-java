import java.util.Scanner;
/**
 * The iteration edition of fibnacci. The time complexity is O(n)
 * @author HUANG-Jun-Hao
 * @version Version1.0
 */
public class FibIteration{
	/**
	 * fibnacci method 
	 * @param n the integer
	 * @return the integer
	 */
	public static int fib(int n){
		if(n==1 || n==2)
			return 1;
		int fib1=1;
		int fib2=2;
		int i=3;
		while(i<=n){
			int temp=fib2;
			fib2=fib1+fib2;
			fib1=temp;
			i++;
		}
		return fib2;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(fib(num));
	}
}
