import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int r=in.nextInt();
      great(n,m,r);
	}
  public static void great(int a,int b,int c)
  {
    if(a>b && a>c)
      System.out.println(a);
    else if(b>a &&b>c)
      System.out.println(b);
    else
      System.out.println(c);
}
}