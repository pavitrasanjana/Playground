import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      	Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
     	int b=sc.nextInt();
      	int c=sc.nextInt();
      	int min;
      	if(a>b)
        {
          	min=b;
        }
      	else
        {
          	min=a;
        }
      	while(min>=1)
        {
          	if(a%min==0&&b%min==0)
            {
              	//System.out.print(min);
              break;
            }
          	else
            {
              	min=min-1;
            }
          
        }
      	int t=min;
      if(t>c)
      {
        	min=c;
      }
      else
      {
        	min=t;
      }
      while(min>=1)
        {
          	if(t%min==0&&c%min==0)
            {
              	System.out.print(min);
              break;
            }
          	else
            {
              	min=min-1;
            }
      }
      
	}
}