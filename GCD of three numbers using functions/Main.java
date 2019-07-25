import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner on=new Scanner(System.in);
      int n=on.nextInt();
      int m=on.nextInt();
      int r=on.nextInt();
      gcd(n,m,r);
	}
  public static void gcd(int a,int b,int c)
  {
    int i,g=0;
    for(i=1;i<=a && i<=b && i<=c;i++)
    {
      if(a%i==0 && b%i==0 && c%i==0)
        g=i;
    }
    System.out.println(g);
    
  }
}