import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      		a[i]=sc.nextInt();
    }
    	int ele=a[0],k=0;
    	for(int j=1;j<n;j++)
        {
          	if(a[j]>ele)
            {
              		ele=a[j];
              		k=j;
            }
        }
    	System.out.print(k);
  }
}