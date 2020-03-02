public class TestCountDown{
	public static void countdown(int n){
		if(n==0)
			System.out.println("Blastoff");
		else{
			countdown(n-1);
			System.out.println(n);
		}
	} 
	public static void main(String[] args){
		countdown(3);
	}

}
