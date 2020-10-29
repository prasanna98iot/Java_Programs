import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ip = sc.nextLine();
	
	    //String ip = "aaaaabbbbcccbtttyyyyy";
	    int ip_len = ip.length();
	    char ip_arr[] = ip.toCharArray();
	    char temp_arr[] = new char[ip_len];
	    //System.out.println(Arrays.toString(chr_arr));
	    int i=0,j=0;
	    
	    for(i=0;i<ip_len-1;i++)
	    {
	        if(ip_arr[i]!=ip_arr[i+1])
	            {temp_arr[j] = ip_arr[i];
	            
	            j++;}                       //To Store Single elements
	    }
        System.out.println("j is "+j);
        if(j==ip_len-1)
        {
            System.out.println(ip);
            System.exit(0);
        }
	    
	    
	    temp_arr[j]=ip_arr[ip_len-1];       //To Store last element
	    System.out.println(Arrays.toString(temp_arr));
	    
	    //int count_arr[] = new int[temp_arr.length];
	    i=0; j=0;
	    int count_arr[] = new int[ip_len];
	    
	    while(j<ip_len)
	    {
	        int count = 0;
	        for(;i<ip_len;i++)
	        {
	            if(temp_arr[j]==ip_arr[i])
	                count++;
	            else
	                break;
	        }
	       //System.out.print("i is "+i);
	        count_arr[j] = count;
	        j++;
	    }
	  System.out.println(Arrays.toString(count_arr));      
	      i=0;
	      while(i<ip_len)
	      {
	          if(count_arr[i]==0)
	            break;
	          System.out.print(temp_arr[i]+""+count_arr[i]);
	          i++;
	      }
	    
	}
}

