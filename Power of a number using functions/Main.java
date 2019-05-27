import java.util.Scanner;
class Main
{
  	public static void expo(int a,int b)
    {
      	int pro=1;
      	for(int i=1;i<=b;i++)
        {
          	pro=pro*a;
        }
      System.out.println(pro);	
    }
  	public static void main(String args[])
    {
      	Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      	int b=sc.nextInt();
      	expo(a,b);
    }
}