import java.util.Scanner;
public class Main{

    public static void main(String[] args) {

        int low =2,high;
      Scanner in=new Scanner(System.in);
      high=in.nextInt();

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(low + " ");

            ++low;
        }
    }
}