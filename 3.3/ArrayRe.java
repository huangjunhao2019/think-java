public class ArrayRe{
	public static void main(String[] args){
		int[] values={1,2,3,4};
		System.out.println(values[0]);
		change(values);
		System.out.println(values[0]);
	}
	public static void change(int[] values){
		values[0]=200;
	}
}
/**
 * 这个函数充分说明了，在函数中对数组进行修改，是可以影响到主函数的，也就是说，java中的数
 * 不是正规值传递
 */
