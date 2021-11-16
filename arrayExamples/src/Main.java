public class Main {
    public static void main(String[] args) {
        //average
        int[] myList={20,30,40,50,60,70};
        int sum=0;
        for(int i=0; i<myList.length; i++) {
            sum+=myList[i];
        }
        System.out.println("average of myList: "+sum/myList.length);


        //harmonic average
        double[] myList1={20,30,40,50,60,70};
        double harmonicSum=0.0;
        for(int i=0; i< myList1.length; i++){
            harmonicSum+=1/myList1[i];
        }
        System.out.println("harmonic average of myList: "+myList1.length/harmonicSum);
    }



}

