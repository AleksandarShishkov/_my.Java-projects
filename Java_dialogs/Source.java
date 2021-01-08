




import javax.swing.JOptionPane;




public class Source {
    public static void main(String[] args)
    {
        String name;                                            // a string to hold the name
        int age;                                                // an int to hold the age
        double pay;                                             // a double to hold the amount

        String input;                                           // a string to hold the inputed data

        name = JOptionPane.showInputDialog(null,                // prompt the user to enter the name
                        "What is your name?");

        input = JOptionPane.showInputDialog(null,               // prompt the user to enter the age
                        "Wgat is your age?");
        age = Integer.parseInt(input);                          // convert the input to an int

        input = JOptionPane.showInputDialog(null,               // prompt the user to enter the income
                        "What is your yearly income?");
        pay = Double.parseDouble(input);                        // convert the input to a double


        JOptionPane.showMessageDialog(null,                     // first message box with the name and 
                        "Your name is " + name +                // the age
                        " and your age is " + age);

        
        JOptionPane.showMessageDialog(null,                     // second message box with the amount
                        "Your yearly income is $" +
                        pay);





        System.exit(0);
    }
    
}


