import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j;
      for(i=0;i<n;i++)
      {
        	a[i]=sc.nextInt();
      }
      int val=sc.nextInt();
      int sum;
      for(i=0;i<n;i++)
      {
        	for(j=i+1;j<n;j++)
            {
              	sum=a[i]+a[j];
              	if(sum==val)
                {
                  	System.out.println(a[i]+", "+a[j]);
                }
            }
      }
      
      
    }
}