class Solution {
    public int lengthOfLastWord(String a) {
        a.trim();
        String[]c=a.split("\\s+");
        return c[c.length-1].length();
        
    }
}
