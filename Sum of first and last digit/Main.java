import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int r,rev=0,ld,fd,s;
      int n=in.nextInt();
      ld=n%10;
      while(n>0)
      {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
      }
      fd=rev%10;
      s=ld+fd;
      System.out.println(s);
	}
}