public class reverse {
    public static void main(String[] args) {
        int number=12345;
        int rev = 0; // reversed number
        int rem;   // remainder

        while(number>0){

            rem = number%10;
            rev = (rev*10) + rem;
            number = number/10;
        }
        System.out.println("Reverse number is "+ rev);
    }
}
