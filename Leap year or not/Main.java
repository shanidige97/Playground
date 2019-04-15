import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(((n%4==0 && n%100 !=0)||(n%100==0 && n%400==0)))
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
    }
}