import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i;
      int tem,rem,sum=0,fact;
      tem=n;
      while(tem>0)
      {
        fact=1;
        i=1;
        rem=tem%10;
        while(i<=rem)
        {
          fact=fact*i;
          i++;
        }
       sum=sum+fact;
        tem=tem/10;
      }
      if(n == sum)
         System.out.println("Yes");
      else
         System.out.println("No");
        
}
}