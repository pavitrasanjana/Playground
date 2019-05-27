import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a;
      a=sc.nextInt();
      int b,c;
      b=a/100;
      c=a%10;
      int d=b+c;
      System.out.println(d);
	}
  
}