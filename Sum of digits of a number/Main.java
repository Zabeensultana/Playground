import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int r,ld;
      int n=in.nextInt();
      int sum=0;
      while(n>0)
      {
        r=n%100;
        ld=r%10;
        sum=sum+ld;
         n=n/10;
      }
      System.out.println(sum);
	}
}