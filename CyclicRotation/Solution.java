import java.util.stream.IntStream;

public class Solution {

    static int [] rotateArray(int [] A, int K){
        int [] result = new int[A.length];

        for (int i = 0 ; i < A.length ; i++){
            result[(i + K)%A.length] = A[i];
        }

        return result;
    }
    static int [] getRotatedArray(int [] A, int K){
        int [] result ;
        if(A.length == K){
            result = A;
        }else if(K == 0){
            result = A;
        }else if(IntStream.of(A).allMatch(x -> x == A[0])){
            result = A;
        }else{
            result = rotateArray(A,K);
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr = new int[] {3,8,9,7,6};
        int [] ans = getRotatedArray(arr, 3);
        for (int item : ans) {
            System.out.print(item);
        }
    }
}
