/**
 * The famou Hanoi problem. It also declare that
 * the static need to be in class but outside the method.
 */
import java.util.Scanner;
public class Hanoi{
	static int time=0;
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String A="a",B="b",C="c";
		while(scan.hasNextInt()){
			int temp=scan.nextInt();
		        solve(A,B,C,temp);
			System.out.println("It moved "+time+" times");
		}
		
	}
	
	public static void solve(String A,String B,String C,int n){
		if(n==0)
			return ;
		solve(A,C,B,n-1);
		System.out.println(A+"->"+C);
		time++;
		solve(B,A,C,n-1);
	}
}	
