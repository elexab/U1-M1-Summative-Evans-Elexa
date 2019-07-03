import java.util.Scanner;

public class MonthConverterIf {

    //MAIN METHOD
    public static void main(String[] args) {

        //SCANNER STATEMENT
        Scanner scanner = new Scanner(System.in);

        //ASK USER TO ENTER A NUMBER BETWEEN 1-12
        System.out.println("Please enter a number between 1 and 12: ");
        int num = scanner.nextInt();//READS IN INPUT FROM USER AND STORES IT AS A VARIABLE

        //IF STATEMENTS TO PRINT CORRECT MONTH ACCORDING TO USER INPUT
        if (num == 1) {
            System.out.println("Janaury");
        }
        else if (num == 2) {
            System.out.println("February");
        }
        else if (num == 3) {
            System.out.println("March");
        }
        else if (num == 4) {
            System.out.println("April");
        }
        else if (num == 5) {
            System.out.println("May");
        }
        else if (num == 6) {
            System.out.println("June");
        }
        else if (num == 7) {
            System.out.println("July");
        }
        else if (num == 8) {
            System.out.println("August");
        }
        else if (num == 9) {
            System.out.println("September");
        }
        else if (num == 10) {
            System.out.println("October");
        }
        else if (num == 11) {
            System.out.println("November");
        }
        else if (num == 12) {
            System.out.println("December");
        }
        else{//PRINTS OUT ERROR MESSAGE IF NUM IS NOT BETWEEN 1-12
            System.out.println("You have entered an invalid number.  You must enter a " +
                    "number between 1 and 12.  Goodbye.");
        }

    }
}


