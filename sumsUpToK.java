//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
import java.util.Arrays;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {


        int arr[] = {10, 15, -3, 4};
        int k = 12;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.get(arr[i])!=null){
                System.out.println("True "+ arr[i] + " + "+ map.get(arr[i]) );
                break;
            }

            int x = k-arr[i];
            map.put(x,arr[i]);
        }



    }
}