class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 ){
            return 0;
        }
        HashMap<Character, Integer> seen = new HashMap<>();
        int left = 0; 
        seen.put(s.charAt(left), left);
        int right = 1;
        int currLength = 1;
        int maxLength = 1;
        while(left < s.length() && right < s.length()){
            if(seen.containsKey(s.charAt(right))){
                maxLength = Math.max(maxLength, currLength);
                
                if(seen.get(s.charAt(right))+ 1 > left){
                    left = seen.get(s.charAt(right)) + 1;
                }
                seen.put(s.charAt(right), right);
                right++;
                currLength = right - left;
            }else{
                 currLength ++; 
                 seen.put(s.charAt(right), right); 
                 right++;
            }
            
        }
        maxLength = Math.max(maxLength, currLength);
        return maxLength;

        
    }
}
