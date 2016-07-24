public class ECC_04_Palindrome {
    public static void main(String[] args) {
        int num = 7998;
        System.out.println(isPalindrome(num));
    }

    public static int isPalindrome(int num) {
        // ADD YOUR CODE HERE
        int temp_no = num;
        int i = 0;
        if( num <= 0 )
            return -1;
        if(num < 100 || num >= 999)
            return -2;

        while(temp_no > 0){
            i = i * 10;
            i = i + (temp_no % 10);
            temp_no /= 10;

        }

        if(i == num)
        return 1;
        return 0;
    }
}
