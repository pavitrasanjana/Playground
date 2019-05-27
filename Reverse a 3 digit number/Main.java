import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int x=a%10;
    	int y=(a%100)/10;
    	int z=a/100;
    	System.out.print(x);
    	System.out.print(y);
    	System.out.print(z);
          
    	
  }
}