class ECC_08_OddRounder {
    public static void main(String[] args) {
        int num = 31;
        System.out.println(oddRounder(num));
    }

    public static int oddRounder(int num) {
        // ADD YOUR CODE HERE
        if(num < 0 )
            return -1;
        if(num == 0)
            return -2;
        if(num % 2 == 0 )
            return num;
        while(num % 10 != 0)
            ++num;
        return num;

    }

}

