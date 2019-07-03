import java.util.Scanner;
import java.util.Arrays;
public class ArrayFun5Words {

    //MAIN METHOD
    public static void main(String[] args){

        //SCANNER STATEMENT
        Scanner scanner = new Scanner(System.in);

        //CREATE STRING ARRAY
        String[] wordArray = new String[5];

        //ASK USER TO ENTER FIVE WORDS
        System.out.println("Please enter five words: ");
        for(int i = 0; i < 5; i++) {//GOES THROUGH THE ARRAY
            wordArray[i] = scanner.nextLine();//SAVES USER INPUT INTO ARRAY
        }

        System.out.println(Arrays.toString(wordArray));//PRINTS OUT THE ARRAY

    }
}
