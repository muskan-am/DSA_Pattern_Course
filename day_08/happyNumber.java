
public class happyNumber {   //TC : O(n), SC : O(1)

    public static int sumOfSquareOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum = sum + (dig * dig);
            n = n / 10;
        }
        return sum;
    }


    public static boolean isHappy(int n) {
        int slow = n,
                fast = n;

        while (fast != 1) {
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));

            if (fast == 1) {
                return true;
            }

            if (slow == fast) {
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        int n = 2;

        System.out.println(isHappy(n));
    }
}
