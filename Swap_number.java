public class Swap_number {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println("befoe swaping number = " + a + " , " + b  );
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping number = " + a + " , " + b);
    }
}
