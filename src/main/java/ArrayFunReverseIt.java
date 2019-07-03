import java.util.Arrays;
public class ArrayFunReverseIt {

    //MAIN METHOD
    public static void main(String[] args){

        //CREATE AN ARRAY OF INTEGERS
        int[] numArray = {1,2,3,4,5};
        int[] newArray = new int[5];


        for(int i = 4; i >= 0; i--){//GOES THROUGH THE ENTIRE NUM-ARRAY STARTING FROM THE END

            for(int j = 0; j < 5; j++){//GOES THROUGH THE ENTIRE NEW-ARRAY FROM BEGINNING

               newArray[j] = numArray[i];//FILL NEW-ARRAY WITH REVERSE ORDER NUM-ARRAY
                i--;
            }

        }

            System.out.println(Arrays.toString(numArray));//PRINTS OUT THE NUM-ARRAY
            System.out.println(Arrays.toString(newArray));//PRINTS OUT THE NEW-ARRAY
    }
}
