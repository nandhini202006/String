class Solution {
    public boolean isPalindrome(String s) {
        s=s.tolowerCase();
        String c="";
        for(int i=0;i<s.length();i++){
            char d=s.charAt();
            if(character.isletterOrDigit(d)){
                c=c+d;
            }
                
        }
        String y=" ";
        for(int i=c.length()-1;i>=0;i--){
            y=y+charAt(i);

        }

        return y.equals(s);
    }
}
