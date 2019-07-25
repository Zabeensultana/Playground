import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code her
      Scanner in= new Scanner(System.in);
     int n=in.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      a[i]=in.nextInt();
      int max=0;
      for(i=0;i<n;i++)
      {
        if(max<a[i])
          max=a[i];
    }
      System.out.println(max);
    }
}