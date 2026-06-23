class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = "";

        String str = "";
        int len = s.length();

        for (int i = 0;i<len;i++){
            char c = Character.toLowerCase(s.charAt(i));

            if(Character.isLetterOrDigit(c)){
                cleaned+=c;
            }
        }



        for (int i = cleaned.length()-1;i>=0;i--){
            str = str+cleaned.charAt(i);
        }
        return str.equals(cleaned);
      
    }
}
