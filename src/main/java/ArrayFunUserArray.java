import java.util.Scanner;
import java.util.Arrays;
public class ArrayFunUserArray {

    //MAIN METHOD
    public static void main(String[] args){

        //SCANNER STATEMENT
        Scanner scanner = new Scanner(System.in);
        //CREATE AN ARRAY VARIABLE
        int[] numArray = new int[5];

        //ASK USER TO INPUT 5 INTEGERS
        System.out.println("Please enter 5 integars: ");
            for(int i = 0; i < 5; i++) {//GOES THROUGH THE ARRAY
                numArray[i] = scanner.nextInt();//SAVES USER INPUT INTO ARRAY
        }

            System.out.println(Arrays.toString(numArray));//PRINTS OUT THE ARRAY
      }

}
