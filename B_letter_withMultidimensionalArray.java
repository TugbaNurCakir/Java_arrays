public class Main {
    public static void main(String[] args) {
        int[][] list= new int[7][4];

        for(int row=0; row< list.length;row++){
            for(int column=0; column<list[row].length; column++){
                if(row==0 || row==3 || row==6) {
                    System.out.print(" x ");
                }
                else if(column==0 || column==3){
                    System.out.print(" x ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
