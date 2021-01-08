



import javax.swing.JOptionPane;                                                                     // importing the JOptionPane module



// ********************************************************* //
//                                                           //
// Simple Java program which uses the JOptionPane module     //
// The program also calculates and formats the outputed data //
//                                                           //
// ********************************************************* //




public class Source {
    public static void main(String[] args)
    {
        int total_custs = 12467;                                                                    // an integer to hold the total number of the buyers                                                  
        float percentage_total_buyers = 0.14F;                                                      // a float to hold the percentage of the total buyers
        float percentage_buyers_fr_drinks = 0.64F;                                                  // a float to hold the percentage of the byuers 
                                                                                                    // who preffer fruit-flavored drinks

        float num_buyers_drink_weekly;                                                              // a float to hold the number of the buyers 
                                                                                                    // of drinks on weekly basis

        float num_buyers_drink_weekly_fruit;                                                        // a float to hold the number of the buyers 
                                                                                                    // who preffer fruit-flavored drinks

        String buyers_weekly;                                                                       // a string to hold the formatted output
                                                                                                    // for the total buyers

        String buyers_weeklY_fr;                                                                    // a string to hold the formatted output
                                                                                                    // for the buyers with the fruit-flavored drinks


        num_buyers_drink_weekly =                                                                    // calculating the weekly buyers
                        total_custs * percentage_total_buyers;                       
                                                                        


        num_buyers_drink_weekly_fruit = num_buyers_drink_weekly *                                   // calculating the weekly buyers 
                                        percentage_buyers_fr_drinks;                                // who preffer fruit-flavored drinks

        

        buyers_weekly = String.format("%d is the number of people who " +                           // formatting the output for 
                                      " are buyng energy drink on weekly" +                         // the buyers on weekly basis
                                      " basis", (int)num_buyers_drink_weekly);                       // converting num_buyers_drink_weekly to integer 
        


        buyers_weeklY_fr = String.format("%d of them are buyng fruit-flavored " +                   // formatting the output for 
                                      "drinks", (int)num_buyers_drink_weekly_fruit);                // the buyers of fruit-flavored drinks on weekly basis
                                                                                                    // converting num_buyers_dring_weekly_fruit to integer
        




        JOptionPane.showMessageDialog(null, buyers_weekly);                                         // printing the output
        JOptionPane.showMessageDialog(null, buyers_weeklY_fr);                                      // printing the output




        System.exit(0);                                                                             // exiting the program
    }
    
}



