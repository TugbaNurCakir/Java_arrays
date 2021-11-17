import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeatingNumbers = new int[list.length];

        int counter = 0;
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar sayıları");

        for(int i=0; i< list.length; i++){
            for(int j=0; j< list.length; j++){
                if(list[i]==list[j]) {
                    counter+=1;
                }
            }
            if(counter>0){
                if(!isHas(repeatingNumbers, list[i])){
                    System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
                    repeatingNumbers[i] = list[i];
                }
                counter = 0;
            }

        }

    }
    static boolean isHas(int[] arr, int number){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }


}
