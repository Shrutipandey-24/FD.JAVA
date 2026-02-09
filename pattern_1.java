package Patterns;

public class Pattern_1 {
    public static void main(String [] args){
        pattern_1(4);
    }
    static void pattern_1(int n){
        for(int row = 1; row<=n; row++){
            //for every row, run the col
            for(int col = 1; col<= row; col++){
                System.out.print("* ");
            }
            //when one row is prtinted, we need to add a newline
            System.out.println();
        }
    }
}
