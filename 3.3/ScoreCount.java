import java.util.Scanner;
import java.util.Random;
/**
 * 这个程序说明，java中数组是引用传递，即在函数中对数组修改，是可以改变主函数中数组值的
 * 可以理解为在argument 向parameter传递时，是int[] a=b,a与b指向同一个值
 */
public class ScoreCount{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	Random random=new Random();
	int length;
	int Upperload=101;
	System.out.println("Please input the student number");
	length=scan.nextInt();
	int[] students=new int[length];
	int[] scores=new int[101];
	for(int i=0;i<length;i++)
		students[i]=random.nextInt(Upperload);
	count(students,scores);
	for(int i=0;i<scores.length;i++){
		System.out.println(i+"\t"+scores[i]);
	}
	}
	public static int[] count(int[] students, int[] scores){
		for(int value:students){
			scores[value]++;
		}
		return scores;
	}
}
