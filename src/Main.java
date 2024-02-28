import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //bubble sort method
    static void sort(int[] array){
        for( int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                int temporary = 0;
                if(array[i] < array[j]){
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int lengthInput;
        int elementInput;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        lengthInput = scanner.nextInt();

        int[] userArray = new int[lengthInput];

        //ask the user for each element of the array
        for (int i = 0; i < userArray.length; i++){
            System.out.println("Enter element number " + (i + 1) + " : ");
            elementInput = scanner.nextInt();
            userArray[i] = elementInput;
        }

        //sort the array
        sort(userArray);
    }
}