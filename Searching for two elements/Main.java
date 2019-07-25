import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int m=in.nextInt();
      int r=in.nextInt();
      int i,isnum=0,isn=0;
      for(i=0;i<n;i++)
      {
      
        if(m==a[i]){
        
          System.out.println(i);
      isnum=1;
        }
        
      if(r==a[i]){
      
        System.out.println(i);
        isn=1;
      }
      }
     if(isn!=1)
        System.out.println("-1");
      
      
      
    }
}