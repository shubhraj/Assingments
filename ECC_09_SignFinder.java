class ECC_09_SignFinder {
    public static void main(String[] args) {
        int num = -34;
        System.out.println(findSign(num));
    }

    public static int findSign(int num) {

        if( num == 0)
            return 0;
        if ( num > 0)
            return 1;
        return -1;

    }
}

