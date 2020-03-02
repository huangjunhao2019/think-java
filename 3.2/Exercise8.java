import java.util.Scanner;
public class Exercise8{
	public static int ack(int m,int n){
		if(m==0)
			return n+1;
		else if(m>0 && n==0)
			return ack(m-1,1);
		else
			return ack(m-1,ack(m,n-1));
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextInt()){
			int m=scan.nextInt();
			int n=scan.nextInt();
			if(m>=0 && n>=0)
				System.out.println(ack(m,n));
			else
				System.out.println("The numbers shoud be positive");
		}
	}
}
