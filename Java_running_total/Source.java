


        /**
         * 
         * This Java program prompts an input
         * from the user for a number of days. It then
         * uses a for loop to iterate trough each
         * day and multiplies the amount earnd per
         * the previous day.
         * 
         * The beggining amount is set ot 0.01
         * simulating the amount of 1 USD penny.
         * 
         * The program prints the earnings for
         * each day and then show the total in
         * formatted output.
         * 
         */







import java.util.Scanner;                                                                  // importing the Scanner module


public class Source {
    public static void main(String[] args)
    {
        

        double penny = 0.01;                                                                // a double set to 1 penny
        int days;                                                                           // an integer to hold the number of days

        double total = 0;                                                                   // a double to hold the total earnings

        String output;                                                                      // a string to hold the formatted output
      
        
        Scanner scan = new Scanner(System.in);                                              // creating a scanner object

        
        
        System.out.print("\nEnter the days worked> ");                                      // prompting the user to enter the number
                                                                                            // of the days

        days = scan.nextInt();                                                              // inputting the number of days

        while(days < 1)                                                                     // validating the input
        {
            System.out.print("\nInvalid input. Try again> ");
            days = scan.nextInt();
        }


        for(int i = 0; i < days; i++)
        {

            if(i != 0)
            {
                penny *= 2;                                                                 // multiplying the pennies per each
            }
                                                                                            // iteration

            output = String.format("\nMoney earned in day %d: $%.2f", i + 1, penny);        // formatting the output

            System.out.println(output);                                                     // printing the formatted output 

            total += penny;                                                                 // keeping running total of the amount
            
        }

        output = String.format("\nTotal earnings: $%.2f", total);                           // formatting the output for the total

        System.out.println(output + '\n');                                                  // printing the formatted total


        System.out.println("\nThe program has ended!\n");                                   // printing a message indicating
                                                                                            // that the program has ended    

    }
}
