import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.println("enter the numbers that will be in the array");
        for(int i=0; i<size; i++){
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }


}
