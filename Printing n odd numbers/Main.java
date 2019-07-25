import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int tem=1;
      int i;
      for(i=1;tem<=n;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
          tem=tem+1;
        }
        
      }
	}
}