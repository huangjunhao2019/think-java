import java.util.Scanner;
public class TestExp{
	public static void main(String[] args){
		double x;
		int n;
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextDouble()){
			x=scan.nextDouble();
			n=scan.nextInt();
		        check(x,myexp(x,n),myexpBe(x,n),Math.exp(x));	
		}
	}
	public static double myexp(double x,int n){
		double sum=0;
		for(int i=0;i<n;i++){
			sum+=Math.pow(x,i)/fac(i);
		}
		return sum;
	}
	public static void check(double a,double b,double c){
		System.out.println(a+"\t"+b+"\t"+c);
	}
	public static void check(double a,double b,double c,double d){
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	}

	public static double myexpBe(double x,int n){
		double sum=1;
		double temp=1.0;
		for(int i=1;i<n;i++){
			temp*=x/i;
			sum+=temp;
		}
		return sum;

	}
	public static int fac(int n){
		if(n==0 || n==1)
			return 1;
		return n*fac(n-1);
	}
}

