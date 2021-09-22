package dp.longestCommonSubstring;

import static dp.longestCommonSubstring.LongestCommonSubsequence.lcs;

public class InsertDelFromStringToCreateNewString {

    public static void main(String[] args) {

        String str1 = "a";
        String str2 = "a";

        System.out.println(str1.length() + str2.length() -2*lcs(str1, str2));

    }

}
