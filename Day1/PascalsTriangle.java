//Problem Statement: Given an integer N, return the first N rows of Pascal’s triangle.
//
//        In Pascal’s triangle, each number is the sum of the two numbers directly above

//Input Format: N = 5
//
//        Result:
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//
//        Explanation: There are 5 rows in the output matrix. Each row corresponds to each one of the rows

public class Program {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

            int n = scan.nextInt();




            List<List<Integer>> list = new ArrayList<>();


            for(int i=0;i<n;i++){
                List<Integer> arr = new ArrayList<>();
                for(int j=0;j<=i;j++){

                    if(j==0 ||  j==i){
                        arr.add(1);
                    }
                    else{

                        List<Integer> x = list.get(i-1);

                        int sum = x.get(j-1)+x.get(j);
                        arr.add(sum);
                    }
                }

                list.add(arr);
            }


            for(int i=0;i<n;i++){
                System.out.println(list.get(i));
            }


    }
}