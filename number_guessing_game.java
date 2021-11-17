import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // int number = (int) ((Math.random())*100); first technic

        Random random = new Random(); //second technic
        int number = random.nextInt(100);
        System.out.println(number);

        Scanner input = new Scanner(System.in);
        int right=0;
        int entered;
        int[] wrongNumbers = new int[5];
        boolean isWin = false;
        boolean hasWrong = false;

        while(right<5){
            System.out.println("Please enter your guess: ");
            entered = input.nextInt();
            if(entered<0 || entered>99){
                System.out.println("Please enter number that 0 between 100");
                if(hasWrong){
                    right++;
                    System.out.println("You have many wrong answers");
                    System.out.println("Your right is: "+(5-right));
                }
                else{
                    hasWrong=true;
                    System.out.println("next time it is less than your right.");
                }
                continue;
            }
            if(entered==number){
                System.out.println("Congratulations!!!! You win. The number is: "+number);
                isWin=true;
                break;
            }else{
                System.out.println("Wrong number!!!!!");
                if(entered<number){
                    System.out.println("Secret number bigger than entered number.");
                }
                else{
                    System.out.println("Entered number bigger than secret number.");
                }
                wrongNumbers[right++]=entered;
                System.out.println("Your right is: "+(5- right));
            }

        }
        if(!isWin){
            System.out.println("You lost!!!!!");
            if (!hasWrong) {
                System.out.println("Your answers is: "+ Arrays.toString(wrongNumbers ));
            }

        }

    }
}
