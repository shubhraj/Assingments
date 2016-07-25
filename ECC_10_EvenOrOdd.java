public class ECC_10_EvenOrOdd {
    public static void main(String[] args) {
        int num = -43;
        System.out.println(isEvenOrOdd(num));
    }

    public static String isEvenOrOdd(int num) {
        // ADD YOUR CODE HERE
        if ( num <= 0)
            return "Invalid Input";
        else if(num % 2 == 0 )
            return "Even";
        else
            return "Odd";
    }
}
