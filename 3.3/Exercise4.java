import java.util.Scanner;
import java.util.Random;
/**
 * 以后编程中的重要原则之一就是，能使用函数的都要使用函数
 * 在刚开始的时候，能跑出来特别的几个例子就可以，不要刚开始就在输入上耗费太多时间
 */
public class Exercise4{
	public static void main(String[] args){
		int[] a=new int[100];
		Random random=new Random();
		for(int i=0;i<a.length;i++){
			a[i]=random.nextInt(100);
		}
		printArray(a);
		System.out.println(indexOfMax(a));
	}
	public static void printArray(int[] a){
		for(int value:a)
			System.out.print(value+" ");
		System.out.println();
	}
	public static int indexOfMax(int[] a){
		int max=a[0];
		int index=0;
		int i=0;
		for(int value:a){
			if(value>max){
				max=value;
				index=i;
			}
			i++;
		}
		return index;
	}
}

