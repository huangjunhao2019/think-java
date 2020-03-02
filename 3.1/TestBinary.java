/**
 * Exercise for recursion.
 */
import java.util.Scanner;
public class TestBinary{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextInt()){
			int temp=scan.nextInt();
			solve(temp);
			System.out.println();
		}
	}
	/**
	 * This is solve recursion method.
	 */
	public static void solve(int n){
	       if(n!=0){
		       int remainder=n%2;
		       n=n/2;
		       solve(n);
		       System.out.print(remainder);
	       }
	}
}

