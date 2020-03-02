import java.util.Scanner;
public class Fib{
	public static int fib(int n){
		if(n==1 || n==2)
			return 1;
		int recurse1=fib(n-1);
		int recurse2=fib(n-2);
		return recurse1+recurse2;
	}
	public static void main(String[] args){
		int num;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		System.out.println(fib(num));
	}
}
