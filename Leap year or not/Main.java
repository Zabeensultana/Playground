import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
      int year=in.nextInt();
      boolean isleap=false;
      if(year%4==0)
      {
        if(year%100==0)
        {
             if(year%400==0)
               isleap=true;
           else
             isleap=false;
        }
        else isleap=true;
      }
      else
      {
        isleap=false;
      }
      if(isleap==true)
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
    }
}
