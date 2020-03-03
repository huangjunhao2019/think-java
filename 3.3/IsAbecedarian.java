import java.util.Scanner;
public class IsAbecedarian{
	public static void main(String[] args){
		String a="abdest";
		String b="abcade";
		System.out.println(isAbecedarianRe(a));
		System.out.println(isAbecedarianRe(b));

		System.out.println(isAbecedarianIt(a));
		System.out.println(isAbecedarianIt(b));
	}
	public static boolean isAbecedarianRe(String a){
  		if(a.length()==1)
			return true;
		if(a.charAt(0)>a.charAt(1))
			return false;
		return isAbecedarianRe(a.substring(1));
	}
	public static boolean isAbecedarianIt(String a){
		for(int i=0;i<a.length()-1;i++)
		{
			if(a.charAt(i)>a.charAt(i+1))
				return false;
		}
		return true;
	}
}
