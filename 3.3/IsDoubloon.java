import java.util.Scanner;
public class IsDoubloon{
	public static void main(String[] args){
		String a="HuHu";
		System.out.println(isDoubloon(a));
	}
	public static boolean isDoubloon(String a){
		String c=a.toLowerCase();
		int[] b=new int[26];
		for(int i=0;i<c.length();i++){
			int value=c.charAt(i)-'a';
			b[value]++;
		}
		for(int i=0;i<b.length;i++)
			if(b[i]%2!=0)
				return false;
		return true;
	}
}
