package computingFibonacci;



public class fibonacci {

    public static long number(long n) {
        
        if (n <= 0) {
            System.out.println(n + " Is not a valid term in the Fibonacci Sequence!");
            return -1;
        }
        
        else if ( n == 1) {
            return 0;
        } 
        
        else if (n == 2) {
            return 1;
        }
        else {
            long f = 0, s = 1;

            for (long i = 3; i <= n; i++) {
                long temp = s;
                s = f + s;
                f = temp;
            } return s;
        }
    }

    public static void main(String[] args) {
       
        if (args.length != 1) {
            System.out.println("Run file through terminal!");
        } 
        
        else {
            
            try {
                long Index = Integer.parseInt(args[0]);
                long num = number(Index);
                
                if (num != -1) {
                    System.out.println("\nThe " + Index + "th Fibonacci number is: " + num +"\n");
                }
            } 
            
            catch (NumberFormatException e) {
                System.out.println("Invalid");
            }
        }
    }
}



