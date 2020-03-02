import java.util.Scanner;
public class Exercise7{
	public static int oddSum(int n){
		if(n==1)
			return 1;
		int recurse=oddSum(n-2);
		return n+recurse;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int temp=scan.nextInt();
		System.out.println(oddSum(temp));
	}
}
