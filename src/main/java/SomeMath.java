public class SomeMath {

    //MAIN METHOD
    public static void main(String[] args){

        //CREATE AN ARRAY OF DOUBLE NUMBERS
        double[] marks = {42.0,35.1,2.3,40.2,15.6};

        System.out.println(total5(1,2,3,4,5));//CALL METHOD WITH PARAMETERS AND PRINTS
        System.out.println(average5(1,3,5,7,9));//CALL METHOD WITH PARAMETERS AND PRINTS
        System.out.println(largest5(marks)); //CALL METHOD WITH PARAMETERS AND PRINTS

    }

    //TOTAL5 METHOD
    public static int total5(int a, int b, int c, int d, int e){//TAKES IN 5 INTEGERS

        //CREATE A VARIABLE
        int total = a + b + c + d + e;//ADDS ALL OF THE NUMBERS TOGETHER TO EQUAL TOTAL
        return total;
    }
    public static double average5(int a, int b, int c, int d, int e){//TAKES IN 5 INTEGERS
        int average = (a + b + c + d + e) / 5;//GETS THE AVERAGE OF THE 5
         return average;
    }
    public static double largest5(double[] numbers){//TAKES IN AN ARRAY OF DOUBLES
        double largest = numbers[0];//SETS THE LARGEST NUM TO THE FIRST NUM OF ARRAY
        for(int i=1;i < numbers.length;i++){//GOES THROUGH THE ENTIRE ARRAY
            if(numbers[i] > largest){//IF THIS NUMBER IS LARGER THAN THE PREVIOUS
                largest = numbers[i];//REPLACE THE VALUE OF LARGEST WITH THE CURRENT VALUE
            }
        }
            return largest;
    }
}
