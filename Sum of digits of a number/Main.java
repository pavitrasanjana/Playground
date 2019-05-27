import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Get the n value
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
      	int a;
      int b=0;
        // Repeatedly remove last digit until it reaches the second digit
		while(n >0)
		{
		   a= n % 10;
          b=b+a;
          n=n/10;
		}
        // Extract last digit(i.e. second digit)
		System.out.print(b);
	}
}