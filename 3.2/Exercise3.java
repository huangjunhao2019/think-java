import java.util.Random;
import java.util.Scanner;
public class Exercise3{
	public static boolean isTriangle(int a,int b,int c){
		boolean bool1=a+b>c;
		boolean bool2=a+c>b;
		boolean bool3=b+c>a;
		return (bool1 && bool2 && bool3);
	}
	public static void main(String[] args){
	       Scanner scan=new Scanner(System.in);
       	       int temp1,temp2,temp3;
		while(scan.hasNextInt()){
			temp1=scan.nextInt();
			temp2=scan.nextInt();
			temp3=scan.nextInt();
			if(isTriangle(temp1,temp2,temp3))
				System.out.println("Can!");
			else
				System.out.println("Can not!");
		}
	}
}	
