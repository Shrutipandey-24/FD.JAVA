public class assignment {
    public static void main(String[] args){
        //1. Sum of Natural Numbers
        int N = 5;
        int sum = 0;
        for(int i = 1; i< N; i++){
            sum = sum + i;
        }
          System.out.println("sum of first " + N + "natural number is: " + sum);
      
        //2. Multiplication Table
        int N = 7;
        for(int i = 1; i<= 10; i++){
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    
         // 3. Factorial of a Number
        int N = 5;  
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + N + " is: " + fact);
        

        //4. count digit in a number

        int num = 98765;
        int count = 0;
        while (num > 0) {
            num = num / 10; 
            count++;        
        }
        System.out.println("Number of digits: " + count);
        

        // 5. sum of digits
        int num = 432;   
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;  
            sum = sum + digit;     
            num = num / 10;        
        }
        System.out.println("Sum of digits: " + sum);
        

        // 6.palindrome number
        int num = 17;  
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
            
        // 7. fibonacci series
        int N = 7;   
        int first = 0, second = 1;

        System.out.println("Fibonacci Series upto " + N + " terms:");

        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");  

            int next = first + second;  
            first = second;             
            second = next;
        }
        
         // 8. prime number check
        int num = 17;  
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0 && num > 1)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    
        //9.Armstrong number
        int num = 153;   
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;      
            sum = sum + (digit * digit * digit); 
            num = num / 10;             
        }

        if (sum == temp) {
            System.out.println(temp + " is Armstrong");
        } else {
            System.out.println(temp + " is Not Armstrong");
        }

        // 10.Strong number
        int num = 145;   
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;    
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;  
            num = num / 10;    
        }

        if (sum == temp) {
            System.out.println(temp + " is Strong");
        } else {
            System.out.println(temp + " is Not Strong");
        }

        //11. pythagorean triplet
        int limit = 20;
         System.out.println("Pythagorean triplets smaller than " + limit + ":");
        for (int a = 1; a < limit; a++) {
            for (int b = a; b < limit; b++) {  
                for (int c = b; c < limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + ", " + b + ", " + c);
                    }
                }
            }
        }

    }
}
