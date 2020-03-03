import java.util.Arrays;
public class Scrabble{
	public static void main(String[] args){
		String title="huang";
		String test="jun";
		System.out.println(canSpell(title,test));
	}
	public static boolean canSpell(String title,String test){
		int[] a=count(title);
		int[] b=count(test);
		for(int i=0;i<a.length;i++)
			if(a[i]<b[i])
				return false;
		return true;
	}
	public static int[] count(String s){
		s=s.toLowerCase();
		int[] a=new int[26];
		for(int i=0;i<s.length();i++)
		{
			int value=s.charAt(i)-'a';
			a[value]++;
		}
		return a;
	}
}

