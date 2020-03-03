public class StringReverse{
	public static void main(String[] args){
		String r="";
		String s="banana";
		for(int i=s.length()-1;i>=0;i--)
			r=r+s.charAt(i);
		System.out.println(r);
		System.out.println(s.substring(0,3));
		System.out.println(s.indexOf("nan"));

	}
}
