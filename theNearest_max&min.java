import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list= {56, 34, 1, 8, 101, -2, -33};
        int min=list[0];
        int max=list[0];

        for (int i: list) {
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("Min value " + min);
        System.out.println("Max value " + max);


        int[] list1 = {15,12,788,1,-1,-778,2,0};
        Scanner input= new Scanner(System.in);
        System.out.println(Arrays.toString(list1));
        System.out.print("Please enter a number: ");
        int num=input.nextInt();
        min = num;
        max = num;

        for(int i:list1){
            if(i>num){
                if(num==max){
                    max=i;
                }
                if(i<max){
                    max=i;
                }
            }
            if(i<num){
                if(num==min){
                    min=i;
                }
                if(i>min){
                    min=i;
                }
            }
        }

        System.out.println("Girilen sayı: "+num);
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+max);






    }
}
