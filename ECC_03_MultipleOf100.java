public class ECC_03_MultipleOf100 {
    public static void main(String[] args) {
        int num = -199;
        System.out.println(getNextMultipleOf100(num));
    }

    public static int getNextMultipleOf100(int num) {
        // ADD YOUR CODE HERE
        if(num <= 0 )
            return -1;

        while(num % 100 != 0){
            ++num;
        }
        return num;
    }
}
