import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int a[]=new int[n];
      	int b[]=new int[n];
      	int i;
      	for(i=0;i<n;i++)
        {
          	a[i]=sc.nextInt();
        }
      	int k=0,l=0;
      	for(i=0;i<n;i++)
        {
          		if(a[i]!=0)
                {
                  	b[l]=a[i];
                  l++;
                }
          	else
            {
              		k=k+1;
            }
        }
          int m=n-k;
          for(i=m;i<n;i++)
          {
            	b[i]=0;
          }
        for(i=0;i<n;i++)
        {
          	System.out.print(b[i]+" ");
        }

    }
}