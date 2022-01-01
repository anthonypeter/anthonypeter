import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CountString {

	public static void main(String[] args) {
		 String S = "welcome";
		 HashMap<Character, Integer> Str = new HashMap<Character, Integer>();
	      char[] str_array = S.toCharArray();
	      for (char c : str_array){
	         if (Str.containsKey(c)){
	        	 Str.put(c, Str.get(c) + 1);
	         }else{
	        	 Str.put(c, 1);
	         }
	      }
	      Set<Entry<Character,Integer>> Entries = Str.entrySet();
	      for (Entry<Character,Integer> entry: Entries){
	         System.out.println(entry.getKey() + " " + entry.getValue());
	      }

	    
	    	 
	    	 
	     }
	     

	}


