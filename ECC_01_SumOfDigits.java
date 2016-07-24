public class ECC_01_SumOfDigits {
    public static void main(String[] args) {
        int num = 93;
        System.out.println(getSumOfDigits(num));
    }

    public static int getSumOfDigits(int num)	{
        // ADD YOUR CODE HERE
        int sum = 0;
        if(num < 0 )
            return -3;
        if(num > 99)
            return -2;
        if(num > 0 && num <= 9)
            return -1;
        while(num>0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
