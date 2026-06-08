package Linked_List;
import java.util.Scanner;
public class TickTokToe_Game {
    public static void main(String[] args){
        char[][]board = new char[3][3];
        for(int row = 0; row<board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                board[row][column] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("Player " + Player + " enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (board[row][column] == ' ') {

                board[row][column] = player;
                gameOver = haveWon(board, player);
                if(gameOver){
                    System.out.println("Player " + Player + "has won: ");
                }else{
                    if (player == 'X') {

                        player = 'O';
                    }else{
                        player = 'X';
                    }
                }
            }else{
                System.out.println("Invalid move, Try again!");
            }
        }
    }
    public static boolean haveWon(char[][]board, char player){

    }
    public static void printBoard(char[][]board]){

    }
}
