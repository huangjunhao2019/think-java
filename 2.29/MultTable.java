import java.util.Scanner;
public class MultTable{
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			solve(i);
		}
	}
	public static  void solve(int n){
		for(int i=1;i<=n;i++){
			int result=i*n;
			System.out.print(i+"*"+n+"="+result+"\t");
		}
		System.out.println();
	}
}
