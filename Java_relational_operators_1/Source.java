




// ************************************************************************
//                                                                          //
// Java program that promts an input from the user, calculats it`s average, //
// validates it and returns an output with the relevant details.            //
//                                                                          //
// ************************************************************************



import java.util.Scanner;                                                           // importing Scanner module



public class Source {
    public static void main(String[] args)
    {
        float score1;                                                               // a float to hold test score 1
        float score2;                                                               // a float to hold test score 2
        float score3;                                                               // a float to hold test score 3

        float avrg;                                                                 // a float to hold the average score

        Scanner input = new Scanner(System.in);                                     // creating Scanner object input





        System.out.println("\nEnter the first score> ");                            // prompting the user the enter the furst score
        score1 = input.nextFloat();                                                 // assigning the value to score1

        System.out.println("\nEnter the second score> ");                           // prompting the user to enter the second score
        score2 = input.nextFloat();                                                 // assigning the value to score2

        System.out.println("\nEnter the third score> ");                            // prompting the user to enter the third score
        score3 = input.nextFloat();                                                 // assigning the value to score 3
        
        
        avrg = (score1 + score2 + score3) / 3;                                      // calculating the average and assigning it to avrg

        
        if(avrg >= 90 && avrg <= 100)                                               // validating the input
        {
            System.out.printf("\nThe score is %.2f\n Letter grade: 'A'", avrg);
        }
        else if(avrg >= 80 && avrg <= 89)
        {
           System.out.printf("\nThe score is %.2f\n Letter grade: 'B'", avrg);
        }
        else if(avrg >= 70 && avrg <= 79)
        {
            System.out.printf("\nThe score is %.2f\n Letter grade: 'C'", avrg);
        }
        else if(avrg >= 60 && avrg <= 69)
        {
            System.out.printf("\nThe score is %.2f\n Letter grade: 'D'", avrg);
        }
            else if(avrg < 60)
        {
            System.out.printf("\nThe score is %.2f\n Letter grade: 'F'", avrg);
        }
        



        System.exit(0);                                                              // terminating the program

    }
}




