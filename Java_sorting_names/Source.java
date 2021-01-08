



    /**
     * 
     * A simple Java program that prompts the user to 
     * input three names and then sorts them in
     * ascending or descending order in dependence 
     * of the users` choice.
     *  
     */






import javax.swing.JOptionPane;                                                     // impprting JOptionPane module



public class Source {
    public static void main(String[] args)
    {
        String name1;                                                               // a string to hold name 1
        String name2;                                                               // a string to hold name 2
        String name3;                                                               // a string to hold name 3
        String top;                                                                 // a string to hold the first sorted name
        String middle;                                                              // a string to hold the second sorted name
        String bottom;                                                              // a string to hold the third sorted name
        String optionStr;                                                           // a string to hold the user`s input for option
        String res;                                                                 // a string to hold the output


        int option;                                                                 // an integer to hold the option


        name1 = JOptionPane.showInputDialog("Enter name 1: ");                      // requesting the first name
        name2 = JOptionPane.showInputDialog("Enter name 2: ");                      // requesting the second name
        name3 = JOptionPane.showInputDialog("Enter name 3: ");                      // requesting the third name


        optionStr = JOptionPane.showInputDialog("Enter '1' for ascending or " +     // requesting the user to select an
        "'2' for descending order: " );                                             // option

        while(optionStr.charAt(0) != '1'&& optionStr.charAt(0) != '2')              // validating the input
        {
            optionStr = JOptionPane.showInputDialog("Invalid input. " + 
            "Try again ('1' or '2'): ");
        }

        option = Integer.parseInt(optionStr);                                       // converting the selected option in 
                                                                                    // an integer
        top = name1;                                                                // assigning name1 to top
        bottom = name1;                                                             // assigning name1 to bottom

        switch(option)                                                              // using switch operator for the 
                                                                                    // possible cases
        {
            case 1:                                                                 // sorting the names in ascending order

                if(top.compareTo(name2) > 0)
                    top = name2;
                else if(top.compareTo(name3) > 0)
                    top = name3;
            
                if(bottom.compareTo(name2)  < 0)
                    bottom = name2;
                else if(bottom.compareTo(name3) < 0)
                    bottom = name3;

                if(!name1.equals(bottom) && !name1.equals(top))
                    middle = name1;
                else if(!name2.equals(bottom) && !name2.equals(top))
                    middle = name2;
                else
                    middle = name3;
            

                res = String.format("\nThe names are: \n" +                         // formating the output
                    "\n%5s \n%5s \n%5s", top, middle, bottom);

                JOptionPane.showMessageDialog(null, res);                           // printing the output

                break;

            case 2:                                                                 // sorting the names in descending order

            if(top.compareTo(name2) < 0)
                top = name2;
            else if(top.compareTo(name3) < 0)
                top = name3;
    
            if(bottom.compareTo(name2)  > 0)
                bottom = name2;
            else if(bottom.compareTo(name3) > 0)
                bottom = name3;

            if(!name1.equals(bottom) && !name1.equals(top))
                middle = name1;
            else if(!name2.equals(bottom) && !name2.equals(top))
                middle = name2;
            else
                middle = name3;
    

            res = String.format("\nThe names are: \n" +                             // formatting the output
                "\n%5s \n%5s \n%5s", top, middle, bottom);

            JOptionPane.showMessageDialog(null, res);                               // printing the output

            break;

                                                                                    // no default case needed since
                                                                                    // the validation was already made
        }



        System.exit(0);                                                             // exiting with exit(0)
    }
}


