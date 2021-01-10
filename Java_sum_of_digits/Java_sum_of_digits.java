



        /**
         * 
         * This Java program prompts the user to enter
         * the number of the iterations for a for-loop
         * and the value of the loop-step.
         * 
         * Validates the input trough while-loop
         * and calculates the total of the numbers
         * between 0 and the total number of iterations.
         * 
         * It then displays the output to the screen.
         * 
         */





import javax.swing.JOptionPane;                                                     // importing the JOptionPane module

public class Java_sum_of_digits {
    public static void main(String[] args)
    {
        
        int num;                                                                    // an integer to hold the number of the
                                                                                    // iterations

        int iter;                                                                   // an integer to hold the value of the
                                                                                    // loop-step

        int total = 0;                                                              // an integer to hold the running total
        String output;                                                              // a string to hold the formatted output

        
        String input = JOptionPane.showInputDialog(null,                            // prompting the user to enter the number of 
            "Enter an integer for the number \nof the " +                             // the iterations
            "iterations greater than 10");

        num = Integer.parseInt(input);                                              // converting the result to an integer and 
                                                                                    // assigning it to num

        while(num < 10)                                                             // validating the input
        {
            input = JOptionPane.showInputDialog(null,
                "Invalid input. Try again> ");
                
            num = Integer.parseInt(input);
        }



        input = JOptionPane.showInputDialog(null,                                   // prompting the user to enter the value
            "Enter an integer for the loop-step less " +                            // of the loop-step
            "than 10> ");

        iter = Integer.parseInt(input);                                             // converting the result to an integer and
                                                                                    // assigning it to iter

        while(iter <= 0 || iter > 10)                                               // validating the input                                     
        {
            input = JOptionPane.showInputDialog(null,
                "Invalid input. Try again> ");

            iter = Integer.parseInt(input);
        }



        for(int i = 0; i <= num + 1; i+=iter)                                       // entering the for loop, passing arguments for
        {                                                                           // num and iter

            total += i;                                                             // keeping running total                                                         
        }


        output = String.format("\nThe result is: %5d", total);                      // formatting the output

        JOptionPane.showMessageDialog(null,                                         // printing the formatted output on the screen
            output);


        
        JOptionPane.showMessageDialog(null, "\nThe program has " +                  // printing a message indicating that the 
            "ended!");                                                              // program has ended

    }
}
