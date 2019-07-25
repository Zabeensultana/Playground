import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     int m=n%100;
      int r=m/10;
      System.out.println(r);	
	}
}