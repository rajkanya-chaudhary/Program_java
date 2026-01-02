public class Palindrome_number {
    public static void main(String[] args) {
        int n = 1121;
        int sum = 0,rem, temp;
        temp = n;
        while (n>0) {
            rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;

        }
        if(temp == sum)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        } 
    }
}
