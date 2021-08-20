import java.util.HashMap;
public class PhoneBook {

	class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        HashMap<String, Integer> hm = new HashMap<String, Integer>();
	        
	        for(int i=0;i<phone_book.length;i++){
	            hm.put(phone_book[i],i);
	        }

	        for(int i=0;i<phone_book.length;i++) {
	            for(int j=1;j<phone_book[i].length();j++){
	                if(hm.containsKey(phone_book[i].substring(0,j))){
	                    answer = false;
	                    return answer;
	                }
	            }
	        }
	        
	        return answer;
	    }
	}
}
