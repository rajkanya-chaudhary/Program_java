public class Revers_recurrsion {
    public static int reverse(int num)
    {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 99943;
        System.out.println("Revesre Number in recurrsion = " + reverse(num));
    }
}
