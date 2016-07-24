public class ECC_02_DigitChecker {
    public static void main(String[] args) {
        int num = 83;
        System.out.println(getDiffOfDigits(num));
    }
    public static int getDiffOfDigits(int num) {
        // ADD YOUR CODE HERE
        if(num < 0 )
            return -3;
        if(num > 99)
            return -2;
        if(num > 0 && num <= 9)
            return -1;

        int dig1 = num /10;
        int dig2 = num % 10;

        return dig1 - dig2;
    }
}