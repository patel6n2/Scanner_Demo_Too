public class PrintFDemo
{
    public static void main(String[] args)
    {
        String fName = "Nishaan";
        int age = 18;
        double salary = 100000.05;
        final double TAX_RATE = .0435;
        double incomeTax = salary * TAX_RATE;

        System.out.println(fName);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(incomeTax);

        System.out.printf("%-25s %3d %15.2f %8.2f\n", fName, age, salary, incomeTax);

        for(int x = 1; x <= 5; x++)
        {
            System.out.printf("%-25s %3d %15.2f %8.2f\n", fName, age, salary, incomeTax);
        }
    }
}