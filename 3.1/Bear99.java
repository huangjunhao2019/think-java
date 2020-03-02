import java.util.Scanner;
/**
 * A beautiful song.
 */
public class Bear99{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextInt()){
			int num=scan.nextInt();
			sing(num);
		}
	}
	public static void sing(int num){
	        if(num==0){
			singing0();
			return ;
		}
		singing(num);
		sing(num-1);
	}
	public static void  singing0(){
		System.out.println("No bottles of beer on the wall,");
		System.out.println("no bottles of beer,");
		System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
		System.out.println("’cause there are no more bottles of beer on the wall!");
	}
	public static void singing(int num){
		System.out.println(num+" bottles of beer on the wall,");
		System.out.println(num+" bottles of beer,");
		System.out.println("ya’ take one down, ya’ pass it around,");
		System.out.println((num-1)+" bottles of beer on the wall.");
	}
}
