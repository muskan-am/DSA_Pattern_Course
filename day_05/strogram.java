package day_05;
import java.util.Map;
import java.util.HashMap;


//Strobogrammatic Number
public class strogram {

    public static boolean isStrobogrammaticNumber(Map<Character, Character> map, String s) {
        int i = 0;
        int j = s.length() - 1;
        //TC : O(n) , S : O(1);
        while (i <= j) {
            char l = s.charAt(i),
                    r = s.charAt(j);

            if (map.containsKey(l)) {
                if (map.get(l) != r) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "198861";
        // 2,3,4,5 , 7 this is not Strobogrammatic number
        // 0 -> 0
        // 1 -> 1
        // 6 -> 9
        // 8 -> 8
        // 9 -> 6

        Map<Character, Character> map = new HashMap<>();

        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        System.out.println(isStrobogrammaticNumber(map, s));
    }
}
