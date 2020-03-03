import java.util.Scanner;
import java.util.Random;
public class Exercise1{
	public static void main(String[] args){
		double[] a={1,2,3,4};
		double[] b=powArray(a,2);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		int length=100;
		int[] score=new int[length];
		int[] histogram=count(score);
		for(int i=0;i<histogram.length;i++)
			System.out.println(i+"\t"+histogram[i]);
	}
	public static double[] powArray(double[] a,int n){
	      for(int i=0;i<a.length;i++)
		    	     a[i]=Math.pow(a[i],n);
	       return a;
	}
       public static int[] count(int[] score){
                int[] count=new int[100];
                for(int value:score){
	               count[value]++;
		}
               return count;
       }
}       
