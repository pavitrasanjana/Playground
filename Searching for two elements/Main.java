import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        	arr[i]=sc.nextInt();
      }
      int a,b,i,j;
      a=sc.nextInt();
      b=sc.nextInt();
      for(i=0;i<n;i++)
      {
        	if(arr[i]==a)
            {
              	System.out.println(i);
              break;
            }
        
      }
      if(i==n)
      {
        	System.out.println("-1");
      }
      for( j=0;j<n;j++)
      {
        	if(arr[j]==b)
            {
              	System.out.println(j);
              break;
            }
        
      }
      if(j==n)
      {
        	System.out.println("-1");
      }
        	
        	
    }
}