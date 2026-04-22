package oops;
import java.util.ArrayList;
public class lambda_fun {
    public static void main(String[] args) {
        ArrayList<Integer> arr = {3,6,2,88};
        for(int i = 0; i< 5; i++){
            arr.add(i);
        }
        arr.forEach((item) -> {
            System.out.println(item * 2);
        });
    }
    int sum(int a, int b){
        return a+b;
    }
}
