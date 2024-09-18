import java.util.Stack;

public class PrimeStack {
    public static void main(String[] args) {
        //stack to hold prime numbers
        Stack<Integer> primeStack = new Stack<>();
        
        //track primes found
        int count = 0;
        
        //number to test for prime
        int number = 2;
        
        //first 50 prime numbers
        while (count < 50) {
            if (isPrime(number)) {
                primeStack.push(number);  //add prime to stack
                count++;
            }
            number++;
        }
        
        //display primes in descending order
        System.out.println("The first 50 prime numbers in descending order are:");
        while (!primeStack.isEmpty()) {
            System.out.print(primeStack.pop() + " ");
        }
    }
    
    //method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}