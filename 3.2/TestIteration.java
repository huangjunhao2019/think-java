import java.util.Scanner;
public class TestIteration{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			int temp=scan.nextInt();
			solve(temp);
		}
	}
	public static void solve(int n){
		while(n!=1){
			System.out.println(n);
			if(n%2==0){
				n=n/2;
			}
			else{
				n=n*3+1;
			}
		}
	}
}
