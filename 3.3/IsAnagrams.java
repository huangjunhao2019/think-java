import java.util.Arrays;
public class IsAnagrams{
	public static void main(String[] args){
		String a="stop";
		String b="post";
		int[] aim1=count(a);
		int[] aim2=count(b);
		System.out.println(Arrays.equals(aim1,aim2));
	}
	public static int[] count(String a){
		a=a.toLowerCase();
		int[] CountLe=new int[26];
		Arrays.fill(CountLe,0);
		for(int i=0;i<a.length();i++){
			CountLe[i]++;
		}
		return CountLe;
	}
}
