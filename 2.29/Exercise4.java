import java.util.Scanner;
import java.util.Random;
public class Exercise4{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		Random random=new Random();
		int number=random.nextInt(100)+1;
		System.out.println("I am thinking of a number between 1 and 100(include both). Can you guess what it is?");
		System.out.print("Type a number: ");
		int guessNumber=scan.nextInt();
		System.out.println("Your guess is: "+guessNumber);
		System.out.println("The number I was thinkging of is: "+number);
		System.out.println("You are off by: "+Math.abs(number-guessNumber));
	}
}
