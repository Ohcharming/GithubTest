package HelloWorldPack;

public class HelloWorldClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i=1;
   int sum=0;
   
   while(i<=100)
   {
	   sum+=i;
	   i++;
   }
   System.out.println("累加求和结束");
   System.out.println("sum的累加值:"+sum);
	}

}
