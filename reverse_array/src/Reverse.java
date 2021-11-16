public class Reverse {
    public static int[] reverseMyList(int[] list){
       int[] reverse = new int[list.length];
       for(int i =0, j= list.length-1; i<list.length; i++, j--){
           reverse[j]=list[i];
       }
        return reverse;
    }

    public static void printArray(int[] list){
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        int[] myList= {12,24,36,48,96};
        int[] newList = reverseMyList(myList);
        printArray(newList);
    }
}
