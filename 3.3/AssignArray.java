import java.util.Arrays;
public class AssignArray{
	public static void main(String[] args){
		int[] a={1,2,3,4};
		System.out.println(Arrays.toString(a));
		int[] b=a;
		b[0]=10;
		System.out.println(Arrays.toString(a));
	        int[] c=Arrays.copyOf(a,4);
		c[0]=100;
		System.out.println(Arrays.toString(a));
	 	System.out.println(Arrays.toString(c));

	}
}
