public class Factoring {

    public static void main(String[] args) {

    int number = 23;
    int factorNumber = 1;

        while(factorNumber <= number){
            System.out.println("Next: " + factorNumber);
            if(number % factorNumber == 0){
                System.out.println(factorNumber + " is a factor of " + number);
            }
            factorNumber ++;
        }
    }
}
