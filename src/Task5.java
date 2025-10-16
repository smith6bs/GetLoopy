public class Task5
{
    public static void main (String [] args)
    {
        int rows = 5; //number of rows I want
        // String symbol = "*";
        for (int i = 1; i <= rows; i++) { //outer loop for rows
            for (int j = 1; j <= i; j++) { //inner loop stars// 5; i++) {
                System.out.print("*");
            }
            System.out.println(); //next line for each row
        }
    }
}

