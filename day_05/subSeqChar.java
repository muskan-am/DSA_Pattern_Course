package day_05;

// Append Character to String to make SubSequence
public class subSeqChar {
    public static int isSubsequence(String s, String t){
        int i = 0;
        int j =0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length()-j;
    }
    public static void main(String[] args){
        String s = "z";
        String t = "abcde";

        System.out.println(isSubsequence(s, t));
    }
}
