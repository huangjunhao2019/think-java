import java.util.Scanner;
public class MultAdd{
	public static double multadd(double a, double b, double c){
		return a*b+c;
	}
	public static void main(String[] args){
		double arg1,arg2,arg3;
		arg1=1.0;
		arg2=2.0;
		arg3=3.0;
		System.out.println(multadd(arg1,arg2,arg3));
		double arg11=Math.sin(Math.PI/4);
		double arg22=Math.cos(Math.PI/4);
		System.out.println(multadd(1.0/2,arg22,arg11));
		System.out.println(multadd(Math.log(10),1,Math.log(20)));
		System.out.println("Please input the x");
		Scanner scan=new Scanner(System.in);
		double x=scan.nextDouble();
		System.out.println(expSum(x));

	}
	public static double expSum(double x){
		double temp=1-Math.exp(-x);
		double temp2=Math.sqrt(temp);
		double result=multadd(x,Math.exp(-x),temp2);
		return result;
	}
}
