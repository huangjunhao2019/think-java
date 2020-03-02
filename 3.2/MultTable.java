public class MultTable{
	public static void main(String[] args){
		int i=1;
		while(i<10){
			solve(i);
			i++;
		}
	}
	public static void solve(int n){
		int i=1;
		while(i<=n){
			System.out.print(i+"*"+n+"="+i*n+"\t");
			i++;
		}
		System.out.println();
	}
}
