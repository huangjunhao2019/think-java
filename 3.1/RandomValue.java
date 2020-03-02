import java.util.Scanner;
import java.util.Random;
public class RandomValue{
	public static void main(String[] args){
		        Random random=new Random();
			int temp=random.nextInt(100)+1;
			solve(temp);
	}
	public static void solve(int n){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the number you want");
	        int temp=scan.nextInt();
		if(temp==n){
		    System.out.println("Right");
	    	     return ;
		}
   	       else if(temp<n){
			System.out.println("Your number is too low");
 			solve(n);
	       }
	       else{
			System.out.println("Your number is too high");
	 		solve(n);
	       }
	}
}	
