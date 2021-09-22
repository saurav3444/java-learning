package dp.palindromicSubsequence;

import java.util.ArrayList;
import java.util.List;

public class PermutationName {

    public static void main(String[] args) {

        List<Character> str = new ArrayList<>();
        str.add('s');
        str.add('a');
        str.add('u');
//        str.add('r');
//        str.add('a');
//        str.add('v');

        permute(str);
    }

    private static void permute(List<Character> str) {

        helperPermute(str, "");

    }

    private static void helperPermute(List<Character> str, String chosen) {

        if(str.size()==0)
            System.out.println(chosen);

        for (int i = 0; i < str.size(); i++) {

            //choose
            char ch = str.get(i);
            //explore
            if(str.size()>=1)
                str.remove(i);
            helperPermute(str, chosen+ch);
            //unchoose
            str.add(i, ch);
        }
    }
}
