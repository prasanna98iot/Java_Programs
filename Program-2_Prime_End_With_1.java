import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int flag=0,temp=0,rem=0,flag1=0,flag_0=0;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
        String prime="";
    for(int i1=2; i1<n2/2; i1++)
    {
        if(n2%i1==0)
        {
    	while(flag!=1)  
        {
		for(int i = 2; i < n2; i++)
		{
		    if(n2%i==0)
		    {
		        n2=n2+1;
		        i=2;
		        flag=0;
		    }    
		    else
		    {
		    temp = n2;
            rem=temp%10;
            if(rem==1)
                flag=1;
            else
            {
                flag=0;
                n2++;
            }
		    }

		}
		    
        }
        }
    }
    
		
				while(n1<n2)
				{
				    for(int j=2;j<n1; j++)
				        {
				            if(n1%j==0)
				            {
				               flag1=0;
				               break;
				            }
				            else
				            {
				                int temp2 = n1;
				                int rem2 = temp2%10;
				                    if(rem2==1)
				                        flag1=1;
				                    else
				                        flag1=0;
				            }
				            
				        }
				        if(flag1==1)
				            prime=prime+n1+",";
				        n1++;
				}
				System.out.println(prime+n2);
		        

	}
}

