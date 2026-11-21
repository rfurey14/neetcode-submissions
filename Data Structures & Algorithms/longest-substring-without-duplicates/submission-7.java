class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
      HashMap<Character, Integer> seen = new HashMap<>();
      int maxLength = 1;
      int currLength = 1;
      int left = 0; 
      seen.put(s.charAt(left),left);
      int right = 1;

      while(left < s.length() && right < s.length()){
        if(seen.containsKey(s.charAt(right))){
            if(seen.get(s.charAt(right)) + 1 > left ){
                left = seen.get(s.charAt(right)) + 1;
            }
            //update the index where the duplicate was found for the char in map
            seen.put(s.charAt(right), right);
            maxLength = Math.max(maxLength,currLength);
            right++;
            currLength = right - left;
        }
        else{
            currLength++;
            seen.put(s.charAt(right), right); //marked the new character as seen
            right++;

        }
      }
        maxLength = Math.max(maxLength, currLength);
        return maxLength;
    }
}
