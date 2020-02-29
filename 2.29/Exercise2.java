import java.util.Scanner;
public class Exercise2{
	public static void main(String[] args){
		double ce;
		double fa;
		Scanner scan=new Scanner(System.in);
		System.out.println("Pleaser type an Celsius");
		ce=scan.nextInt();
		fa=ce*9/5+32;
		System.out.println(ce+" C = "+fa+" F");
	}
}
