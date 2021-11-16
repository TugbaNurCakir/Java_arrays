import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[5]; //one-dimensional

        //int[][] matris = new int[6][6]; //multidimensional

        int[][] matris ={
                {0,1,2,4,567,9}, //first row, first columns is 0
                {1,2,442,42,5367,119},
                {34,6,77,11,12}
        };
        //This matris have three columns and three rows.

        //System.out.println(matris[1][2]); //442


    /*
        1 2 3 4
        5 6 7 8
        9 10 11 12
     */
        //myList.length=count of rows
        //mylist[i].length=count of column

        int[][] myList = new int[3][4];
        int number=1;
        for(int row=0; row<myList.length; row++){
            for(int column=0; column< myList[row].length; column++){
                myList[row][column]=number++;
            }
        }

        //print mylist

        for(int row=0; row< myList.length; row++){
            for(int column=0; column< myList[row].length; column++){
                System.out.print(myList[row][column] +" ");
            }
            System.out.println();
        }

      // usage forEach loop in multidimensional arrays

        for(int[] row:myList){
            for(int column:row){
                System.out.print(column + " ");
            }
            System.out.println();
        }


    }



}
