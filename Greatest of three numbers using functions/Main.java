import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>b&&a>c)
      {
        	System.out.print(a);
      }
      else if(b>c)
      {
        	System.out.print(b);
      }
      else
      {
        	System.out.print(c);
      }
	}
}