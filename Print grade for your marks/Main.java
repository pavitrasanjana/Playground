import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a>=85)
        {
          	System.out.print("A");
        }
      	else if(a>=75)
                 {
          	System.out.print("B");
        }
      else if(a>=45)
                {
          	System.out.print("c");
        }
      else
      {
        	System.out.print("Fail");
      }

 
    }
}