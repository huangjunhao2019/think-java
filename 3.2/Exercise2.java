import java.util.Scanner;
public class Exercise2{
	public static boolean isDivisible(int n,int m){
		return n%m==0;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		System.out.println(isDivisible(n,m));
	}
}
