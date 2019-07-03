import java.util.Scanner;

public class ValidNumber {

    //MAIN METHOD
    public static void main(String[] args){

        //SCANNER STATEMENT
        Scanner scanner = new Scanner(System.in);

        //CREATE VARIABLE
        int num;

        do {//WILL CONTINUE PRINT THIS MESSAGE IF NUM IS LESS THAN 1 OR MORE THAN 10

            //ASK USER TO INPUT A NUMBER BETWEEN 1-10
            System.out.println("Please enter a number between 1 and 10: ");
              num = scanner.nextInt();//READS IN INPUT FROM USER AND STORES IT AS A VARIABLE

                if(num < 1 || num > 10){//IF NUM IS LESS THAN 1 OR MORE THAN 10
                System.out.println("You must enter a number between 1 and " +
                        "10, please try again.");//ERROR MESSAGE
                }
                else{
                    System.out.println(num);//PRINT NUMBER
                }

           }while(num < 1 || num > 10);//IF NUM IS LESS THAN 1 OR MORE THAN 10

    }


}
