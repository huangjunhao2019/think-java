import java.util.Scanner;
import java.util.Arrays;
public class LetterHist{
	public static void main(String[] args){
		String a="huangjunhao";
		int[] histgram=letterHist(a);
	        System.out.println(Arrays.toString(histgram));
	}
        public static int[] letterHist(String a){
		int[] b=new int[26];
		Arrays.fill(b,0);
		for(int i=0;i<a.length();i++){
			int value=a.charAt(i)-'a';
			b[value]++;
		}
		return b;
	}
}	
