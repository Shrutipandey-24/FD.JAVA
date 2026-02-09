package Patterns;

public class Pattern_2 {
    public static void main(String[] args){
        Pattern_2(4);
    }
    static void Pattern_2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
