import java.util.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String result = sortCharacters(s1);
        
        System.out.println(result);
    }
    
    public static String sortCharacters(String s1)
    {
        int j=0;
        int len = s1.length();
        char charac[] = new char[len];  //Declaring Character Array	
	    ArrayList<Character> charlist = new ArrayList<Character>();   //Array List
	    // Splitting Characters from string to store in an char array 
                for (int i = 0; i < len ; i++)  
                    charac[i] = s1.charAt(i);
        //Sorting the Character Array (Ascending) then reverse it to get descending order array 
                Arrays.sort(charac);
        //Putting elements from sorted char array to list for easier operations
                for(int i=0; i < len; i++)
                    charlist.add(charac[i]);
                int lenlist = charlist.size();
                //System.out.println(charlist);
              int k1=0;
              while(k1<lenlist)
              {
              for(j=0; j<lenlist; j++)
              {
                  for(int k=j+1; k<lenlist; k++)
                  {
                      if(charlist.get(j)==charlist.get(k))
                        {
                            charlist.remove(j);
                            lenlist-=1;
                        }
                  }
              }
              k1++;
              j=0;
              }
              //System.out.println(charlist);
              String result = "";
              for(int j1=lenlist-1; j1>=0; j1--)
                result=result+charlist.get(j1)+"";
              //System.out.println(result);
              return result;
	    

    }
}