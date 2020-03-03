public class StringFormat{
	public static void main(String[] args){
		int hour=8;
		int minute=9;
		int second=10;
		String s=String.format("%02d:%02d:%02d",hour,minute,second);
		System.out.println(s);
	}
}
