import java.util.Scanner;
import java.util.Arrays;
public class Eratosthenes{
	public static void  main(String[] args){
		int n=100;
		boolean[] a=sieve(n);
		printArray(a);
	}
	public static boolean[] sieve(int n){
		boolean[] a=new boolean[n];
		Arrays.fill(a,true);
		a[0]=false;
		a[1]=false;
		for(int i=2;i<n;i++){
			if(a[i])
			{
				changeBool(a,i);
			}
		}
		return a;
	}
	public static void changeBool(boolean[] a,int index){
	        int temp_index=index+index;
		while(temp_index<a.length){
			a[temp_index]=false;
			temp_index+=index;
		}
	}
	public static void printArray(boolean[] a){
		for(int i=0;i<a.length;i++){
			if(a[i])
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
	

		
