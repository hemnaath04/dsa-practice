class Solution {
    public boolean isAnagram(String s, String t) {
        char[] h = s.toCharArray();
        char[] h1 = t.toCharArray();

        Arrays.sort(h);
        Arrays.sort(h1);

        String sorted_h = new String(h);
        String sorted_h1 = new String(h1);

        if(sorted_h.equals(sorted_h1)){
            return true;
        }
        else{
            return false;
        }

        }
    }
