import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
	 
	public String solution(String[] participant, String[] completion) {
		String answer = "";
	    HashMap<String, Integer> h = new HashMap<String, Integer>();
	    	
	    for(String k : participant){
	    		h.put(k, h.getOrDefault(k,0)+1);
	    	}
	    	
	    	for( String k : completion){
	    		h.put(k, h.get(k)-1);
	    	}
	    	
	    	for(Entry<String, Integer> entry : h.entrySet()){
	    		
	    		if(entry.getValue() > 0){
	    			answer = entry.getKey();
	    			break;
	    		}
	    	}
	        return answer;
	    }
}
