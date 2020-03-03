import java.util.Scanner;
public class Recurse{
	public static char first(String s){
		return s.charAt(0);
	}
	public static String rest(String s){
		return s.substring(1);
	}
	public static String middle(String s){
		return s.substring(1,s.length()-1);
	}
	public static int length(String s){
		return s.length();
	}
//	public static void printString(String s);
	public static void main(String[] args){
		String s="huangjunhao";
		System.out.println(first(s));
		System.out.println(rest(s));
		System.out.println(middle(s));
		System.out.println(length(s));
		printString(s);
		printBackward(s);
		String new_s=reverseString(s);
		String a="huangnauh";
		System.out.println(isPalindrome(a));
	}
	public static void printString(String s){
		for(int i=0;i<s.length();i++)
			System.out.println(s.charAt(i));
	}
	public static void printBackward(String s){
		for(int i=s.length()-1;i>=0;i--)
			System.out.println(s.charAt(i));
	}
	public static String reverseString(String s){
		String aim="";
		for(int i=s.length()-1;i>=0;i--){
			aim=aim+s.charAt(i);
		}
		return aim;
	}
	public static boolean isPalindrome(String s){
		if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		if(s.length()==1)
			return true;
		return isPalindrome(s.substring(1,s.length()-1));
	}
}
