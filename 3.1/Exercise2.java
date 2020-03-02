/**
 * Exercise 4.2. Testing whether I need to use static before method.
 */
public class Exercise2{
	public static  void zool(int a,String b, String c){
		System.out.println(a+" "+b+" "+c);
	}
	public static   void main(String[] args){
		zool(11,"huang","jun");
	}
}
/**
 * This test demonstrates that method need to has static.
 */
