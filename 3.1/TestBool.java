import java.util.Scanner;
public class TestBool{
	public static void main(String[] args){
		int n;
		Scanner scan=new Scanner(System.in);
		while(true){
			int temp=scan.nextInt();
			boolean evenFlag=(temp%2)==0;
			if(evenFlag)
				System.out.println(temp+" is even");
			else 
				System.out.println(temp+" is odd");
		}
	}
}

