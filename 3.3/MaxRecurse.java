import java.util.Scanner;
import java.util.Random;
public class MaxRecurse{
	public static void main(String[] args){
		int[] a={1,2,4,3};
		int max=maxInRange(a,0,a.length-1);
		System.out.println(max);
	}
	public static int maxInRange(int[] a,int lowIndex,int highIndex){
	         if(lowIndex==highIndex)
			 return a[lowIndex];
		 int mid=(lowIndex+highIndex)/2;
		 int temp1=maxInRange(a,lowIndex,mid);
		 int temp2=maxInRange(a,mid+1,highIndex);
		 if(temp1>temp2)
			 return temp1;
		 return temp2;
	}
}
