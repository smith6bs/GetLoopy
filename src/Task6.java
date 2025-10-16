public class Task6
{
    public static void main (String [] args)
    {
        int rows = 5; //number of rows I want
        for (int i = 0; i < rows; i++)
        { //outer loop for rows
            for (int j = 0; j < rows- i; j ++)
            { //inner loop stars
                System.out.print("*");
            }
            System.out.println(); //next line for each row
        }
    }
}
