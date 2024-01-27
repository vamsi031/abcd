import java.util.ArrayList;
import java.util.Collections;

public class StringManipulations {
    public static void main(String[] args) {
        String s="abcd";
//        substringsWithForLoops(s);
//        subSequenceWithForLoops(s);
        ArrayList<String> ans = subsequencesWithRecursion(s);
        System.out.println(ans);
    }

    private static ArrayList<String> subsequencesWithRecursion(String s) {
        if(s.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        ArrayList<String> sAns = subsequencesWithRecursion(s.substring(1,s.length()));
//        ArrayList<String> list = new ArrayList<>(sAns);
        int size = sAns.size();
        for(int i=0;i<size;i++){
            sAns.add(s.charAt(0)+sAns.get(i));
        }

        return sAns;

    }

    private static void subSequenceWithForLoops(String s) {
        //formula for subsequence 2^n
        //every character in string has 2 choices yes/no i.e present or not present in subsequence
        //so i.e total subsequences = (total number of characters in a string * 2 )==> 2^n

        int n = s.length();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder subsequence = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subsequence.append(s.charAt(j));
                }
            }
            System.out.println(subsequence);
        }
    }

    public static void substringsWithforLoops(String s){
        //formula for substrings n(n+1)/2
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(s.substring(i,j));
            }

        }
    }
}
