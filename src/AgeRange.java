import java.util.Scanner;

public class AgeRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";
        boolean done = false;

        // Get the age must be between 18-35

        do
        {
            System.out.print("Enter your age (18 - 35): ");
            if(in.hasNextInt())
            {
                age = in.nextInt();
                in.nextLine(); // clear the newline from the keyboard buffer

                if(age >= 18 && age <= 35) //range test
                {
                    System.out.println("You said your age is " + age + " and that is in range.");
                    done = true;
                }
                else // NOT IN RANGE!
                {
                    System.out.println(age + " is not in range [18 - 35]");
                }
            }
            else // not a valid number
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid number!");
            }
        } while(!done);


    }
}