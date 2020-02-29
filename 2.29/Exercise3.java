import java.util.Scanner;
public class Exercise3{
	public static void main(String[] args){
		System.out.println("Please input the seconds");
		Scanner scan=new Scanner(System.in);
		int seconds=scan.nextInt();
		int hour=seconds/3600;
		int minute=(seconds%3600)/60;
		int second=seconds%60;
		System.out.println(seconds+" seconds = "+hour+" hours, "+minute+" minutes, "+" and "+second+" seconds");
	}
}
