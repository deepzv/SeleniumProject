public class IfElse {

    public static void main(String[] args)
    {
        int marks = 56;
        System.out.println("You got 56 marks");

        if (marks >= 40)
        {
            System.out.println("Congratulations ! You passed");
            if (marks >= 80)
            {
                System.out.println("You secured a Distinction!");
            }
            else if (marks >= 60)
            {
                System.out.println("You secured a First class");
            }
            else if (marks >= 40)
            {
                System.out.println("You secured a Second class");
            }
            else
                System.out.println("FAILED");
        }
    }
}
