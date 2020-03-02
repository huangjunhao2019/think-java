import java.util.Scanner;
public class Power{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextDouble()){
			double x=scan.nextDouble();
			int n=scan.nextInt();
			double result_it=powerIt(x,n);
			double result_re=powerRe(x,n);
			System.out.println("Iteration: "+result_it+", recursion "+result_re);
		}
	}
	public static double powerIt(double x,int n){
		double result=1.0; 
		for(int i=0;i<n;i++){
		      result*=x;
		}
		return result;
	}
	public static double powerRe(double x,int n){
		if(n==1)
			return x;
		return x*powerRe(x,n-1);
	}
}
