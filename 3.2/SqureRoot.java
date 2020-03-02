import java.util.Scanner;
public class SqureRoot{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double temp;
		while(scan.hasNextDouble()){
			temp=scan.nextDouble();
			System.out.printf("Iteration methods: %f, recursion methods: %f\n",squreRoot(temp),squreRootRe(temp,temp/2));
		}
	}
	public static double squreRoot(double temp){
		double a=temp;
		double x=a/2;
		while(Math.abs(a-x*x)>0.0001){
			x=(x+a/x)/2;
		}
		return x;
	}
	public static double squreRootRe(double a,double x){
		if(Math.abs(x*x-a)<0.0001)
			return x;
		x=(x+a/x)/2;
		return squreRootRe(a,x);
	}
}
