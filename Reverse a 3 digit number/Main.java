import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
   int number=in.nextInt(); 
    int reversedNumber=0,temp;
   while(number > 0){
			
			//use modulus operator to strip off the last digit
			temp = number%10;
			
			//create the reversed number
			reversedNumber = reversedNumber * 10 + temp;
			number = number/10;
			 
   }

   System.out.println(reversedNumber);
    //Type your code here
  }
}