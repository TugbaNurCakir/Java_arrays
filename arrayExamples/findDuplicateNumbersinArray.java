import java.util.Arrays;

public class Main {
    static boolean isHas(int[] arr, int value){
        for(int i: arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3,7,3,6,9,10,21,1,33,6,1,10};
        int[] duplicate = new int[list.length];
        int startIndex=0;
        for(int i=0; i<list.length; i++){
            for(int j=0; j< list.length; j++){
                if(i!=j && (list[i]==list[j] && list[i]%2==0)){
                    if(!isHas(duplicate, list[i])){
                        duplicate[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }

}
