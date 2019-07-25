import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
      int m=n/100;
      int sum=n%10;
      int p=m+sum;
      System.out.println(p);	
      // Type your code here
	}
}