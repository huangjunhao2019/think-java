import java.util.Scanner;
public class TestCount{
	public static void main(String[] args){
		//String s="((3+7)*2)";
		for(int i=0;i<args.length;i++){
			int count=countPh(args[i]);
			System.out.println(count);
		}
	}
	public static int countPh(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='(')
				count++;
			else if(c==')')
				count--;
		}
		return count;
	}
}
