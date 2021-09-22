package dp.longestCommonSubstring;

class IsSubsequenceOrNot {

    boolean isSubSequence(String A, String B){
        
        int m = 0, n = 0;
        
        while(m<A.length() && n<B.length()){
            
            if(A.charAt(m)==B.charAt(n)){
                
                m++; n++;
            }
            else
                n++;
        }
        
        if(m==A.length())
            return true;
        
        return false;
    }
}