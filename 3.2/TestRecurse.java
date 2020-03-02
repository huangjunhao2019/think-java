import java.util.Scanner;
public class TestRecurse{
       public static void main(String[] args)
       {
		Scanner scan=new Scanner(System.in);
 		while(scan.hasNextInt()){
			int temp=scan.nextInt();
			solve(temp);
		}
       }
	public static void solve(int n){
	              if(n==1){
	    			System.out.println(n);
	  			return ;
		      }
		if(n%2==0)
  		   {
   			System.out.println(n);
			solve(n/2);
		}
		else
			{
				System.out.println(n);
				solve(3*n+1);
			}
	}
}	
