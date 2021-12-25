package Algorithm;

import java.util.ArrayList;

public class Permutations {
	
	    public static void findPermutations(String str)
	    {
	        
	        if (str == null || str.length() == 0) {
	            return;
	        }
	 
	        ArrayList<String> partial = new ArrayList<>();
	 
	        partial.add(String.valueOf(str.charAt(0)));
	 
	        for (int i = 1; i < str.length(); i++)
	        {
	 
	            for (int j = partial.size() - 1; j >= 0 ; j--)
	            {
	                String s = partial.remove(j);
	 
	 
	                for (int k = 0; k <= s.length(); k++)
	                {
	                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
	                }
	            }
	        }
	 
	        System.out.println(partial);
	    }
	 
	    public static void main(String[] args)
	    {
	     //   String str = "ABC";
	       // findPermutations(str);
	    
	    
	        String str = "ABC";
	        int n = str.length();
	        Permutations permutation = new Permutations();
	        permutation.permute(str, 0, n-1);
	    }
	 
	    /**
	    * permutation function
	    *  str string to calculate permutation for
	    *  l starting index
	    *  r end index
	    */
	    private void permute(String str, int l, int r)
	    {
	        if (l == r)
	            System.out.println(str);
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                permute(str, l+1, r);
	                str = swap(str,l,i);
	            }
	        }
	    }
	 
	    /**
	    * Swap Characters at position
	    *  a string value
	    *  i position 1
	    *  j position 2
	    * @return swapped string
	    */
	    public String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
	 
	}



	


