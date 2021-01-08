import javax.swing.JOptionPane;                                                 // importing the JOptionPane module


// *********************************************************
//                                                        //
// Simple Java program which uses the JOptionPane module. //
// It also calculates an output with user defined value   //
//                                                        //
// *********************************************************



public class Source {
    public static void main(String[] args)
    {

        int cookie;                                                             // an integer to hold the number of the cookies
        String input;                                                           // a string to hold the user`s input
        int portion = 10;                                                       // an integer to hold the number of portions
        int calories = 300;                                                     // an integer to hold the number of calories
        double res;                                                             // a double to hold the result 
        String output;                                                          // a string to hold the formatted output


        input = JOptionPane.showInputDialog(null,                               // setting the input 
                    "\nHow many cookies have you eaten? ");
        cookie = Integer.parseInt(input);                                       // converting the input to an integer

        res = ((double)cookie / portion) * calories;                            // calculating the result
        output = String.format("The calories for %d cookies are: %.2f \n"       // formatting the output
                    , cookie, res); 

        JOptionPane.showMessageDialog(null, output);                            // printing the output


        System.exit(0);                                                         // exiting the program

    }
}
