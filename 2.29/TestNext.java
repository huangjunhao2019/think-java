import java.util.Scanner;
public class TestNext{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your age?");
		String age=scan.nextLine();
		System.out.print("What is your name");
		String name=scan.nextLine();
		System.out.printf("Hello %s, age %s\n", name, age);
	}
}

