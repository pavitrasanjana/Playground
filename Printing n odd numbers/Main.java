import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;
      	for(int i=1;i<=1000;i++)
      	{
        	if(i%2==1)
            {
              	System.out.println(i);
              c++;
            }
          	
          if(n==c)
          {
            	break;
          }
          	
      	}
    }
}