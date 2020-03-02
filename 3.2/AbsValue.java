public class AbsValue{
	public static double abs(double x){
		if(x<0){
			return -x;
		}
		else if(x>0){
			return x;
		}
	}
	public static void main(String[] args){
		double x=1;
		abs(1);
	}
}

