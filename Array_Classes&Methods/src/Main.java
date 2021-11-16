import java.util.Arrays;

public class Main{


    public static void main(String[] args) {
        int[] list= {10,2,13,-4};

        //toString()
        System.out.println(Arrays.toString(list)); //output: [1, 2, 3, 4]

        //fill()
        Arrays.fill(list, 10);
        System.out.println(Arrays.toString(list)); //output: [10, 10, 10, 10]

        //fill() with 3 parameters
        Arrays.fill(list, 0, list.length,10); //list.lenght instead of 3
        System.out.println(Arrays.toString(list));

        int[] list1 = {10, -2, -1001, 123123};
        //sort() //smaller to bigger sorting
        Arrays.sort(list1);
        System.out.println(Arrays.toString(list1));

        //binarySearch() ->>>>>sort array before using
        System.out.println(Arrays.binarySearch(list1, -2)); //output: 1

        //copyOf()
        int[] copyList = Arrays.copyOf(list1, 4); // usable list1.length or any number instead of 4
        System.out.println(Arrays.toString(copyList));

        //copyOfRange()
        int[] copyRange = Arrays.copyOfRange(list1, 1, 4);
        System.out.println(Arrays.toString(copyRange)); //output: [-2, 10, 123123]

        //equals() return true or false
        int[] myList1 = {2,4,6};
        int[] myList2 = {5,7,9};
        int[] myList3 = {2,4,6};

        System.out.println(Arrays.equals(myList1, myList3)); //output: true

    }

}
