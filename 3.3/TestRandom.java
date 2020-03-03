import java.util.Scanner;
import java.util.Random;
public class TestRandom{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=rand.nextInt(size%100);
		}
		solve(a,size%100);
	}
	public static void solve(int[] a,int size){
		for(int i=0;i<size;i++){
			System.out.println(i+"\t"+count(a,i));
		}
	}
	public static int count(int[] a,int value){
		int num=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==value)
				num++;
		}
		return num;
	}
}
