import java.util.Scanner;
class Main{
  public static int pow(int a,int b)
  {
    int i,p=1;
    for(i=1;i<=b;i++)
    {
    p=p*a;
    }
    return p;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int pi=pow(n,m);
    System.out.println(pi);
  }
}