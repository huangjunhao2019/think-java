import java.util.Scanner;
public class TestFac{
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		int recurse=factorial(n-1);
		int result=n*recurse;
		return result;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(factorial(n));
	}
}
