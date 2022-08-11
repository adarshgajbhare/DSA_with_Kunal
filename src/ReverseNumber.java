public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int rem = 0;
        int rev = 0;
        System.out.println("Before reverse number is:-"+ num);
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num /10;
        }
        System.out.println("Reversed Number is:-"+ rev);

    }
}
