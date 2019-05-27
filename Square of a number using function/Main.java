import java.util.Scanner;
class Main
{
  	 public static int square(int n)
      {
        	int k=n*n;
        	return k;
      }
	public static void main (String[] args)
    {
	 // Type your code here   
     	Scanner sc=new Scanner(System.in);
      	int l=sc.nextInt();
		int h; 
      h=square(l);
      System.out.println(h);
      
	} 
}