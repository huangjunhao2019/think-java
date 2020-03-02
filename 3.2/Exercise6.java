import java.util.Scanner;
/**
 * 这个程序是iteration，不是Recursion。
 * @autho huangjunhao 
 * @time 2020.3.2
 */
 
public class Exercise6{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
	        double x;
		int n;
		while(scan.hasNextDouble()){
			x=scan.nextDouble();
			n=scan.nextInt();
			System.out.println("The exp(-"+x+"*"+x+")is"+"iteration "+gauss(x,n)+"\t"+"Recurion "+gauss(x,n)+"\t"+Math.exp(-x*x));
		}
	}
	public static double gauss(double x, int n){
		double temp=1;
		double sum=1;
		for(int i=1;i<n;i++){
			temp*=-x*x/i;
			sum+=temp;
		}
		return sum;
	}
	public static double fab(int n){
		if(n==1)
			return 1;
		return n*fab(n-1);
	}

	public static double gaussRe(double x,int n){
		if(n==1)
			return 1;
		return Math.pow(-1,n)*Math.pow(x,2*n)/fab(n)+gaussRe(x,n-1);

	}
}
