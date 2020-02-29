public class Time{
	public static void main(String[] args){
		int hour,minute,second;
		hour=14;
		minute=55;
		second=40;
		int sinceMidDay=second+minute*60+hour*60*60;
		System.out.println("It has passed "+sinceMidDay+"seconds since mid day");
		int percentage=sinceMidDay*100/(24*60*60);
		System.out.println("It has psssed %"+percentage+" of today");
	}
}
