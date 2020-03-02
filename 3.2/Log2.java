public class Log2{
	public static void main(String[] args){
		final double LOG2=Math.log(2);
		int i=1;
		while(i<20){
			System.out.println(i+"\t"+Math.log(i));
			i++;
		}
	}
}
