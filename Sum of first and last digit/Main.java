import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int last=n%10;
      while(n>=10)
      {
        	n=n/10;
      }
      int x=n+last;
      System.out.println(x);
	}
}