



// ******************************************************************
//                                                                   //
// A Java program that promts an input from the user, validates it,  //
// calculats it, formats the output and prints it in a message box.  //
//                                                                   //
// ******************************************************************



import javax.swing.JOptionPane;                                                           // importing Scanner module




public class Source {
    public static void main(String[] args)
    {
        final int minutes = 60;                                                      // a constant integer to hold the number of seconds in a minute
        final int hours = 3600;                                                      // a constant integer to hold the number of seconds in an hour
        final int days = 84400;                                                      // a constant integer to hold the number of second in a day
       
       
        int seconds;                                                                 // an integer to hold the number of seconds
        float num_minutes;                                                           // a float to hold the number of minutes
        float num_hours;                                                             // a float to hold the number of hours
        float num_days;                                                              // a float to hold the number of days


        String input;                                                                // a string to hold the user`s input
        String output;                                                               // a string to hold the output



        input = JOptionPane.showInputDialog(null, "\nEnter the number " +            // prompting the user to input number of seconds
                            "of seconds> ");

        
        seconds = Integer.parseInt(input);                                            // comverting the input to an integer 

        while(seconds < 0)                                                            // validating the input
        {
            input = JOptionPane.showInputDialog(null, "\nInvalid input. " + 
                            "Try again> ");

            seconds = Integer.parseInt(input);
        }


        if(seconds >= 60 && seconds <3600)
        {
            num_minutes = (float)seconds / minutes;                                    // calculating the number of minutes
            output = String.format("\n%,d = to %.2f minutes\n",                        // formatting the output
                                   seconds, num_minutes);                              

            JOptionPane.showMessageDialog(null, output);                               // printing the output
        }
        else if(seconds >= 3600 && seconds < 86400)
        {
            num_hours = (float)seconds / hours;                                        // calculating the number of hours
            output = String.format("\n%,d = to %.2f hours\n",                          // formatting the output
                                   seconds, num_hours);

            JOptionPane.showMessageDialog(null, output);                               // printing the output
        }
        else if(seconds >= 86400)
        {
            num_days = (float)seconds / days;                                          // calculating the number of days
            output = String.format("\n%,d = to %.2f days\n",                           // fomatting the output
                                   seconds, num_days);

            JOptionPane.showMessageDialog(null, output);                               // printing the output
        }


       

       


        System.exit(0);                                                              // terminating the program
    }
}



