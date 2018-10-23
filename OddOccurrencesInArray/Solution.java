import java.util.HashMap;

public class Solution {


    static int getOddOccurence(int[]A){
        HashMap<Integer,Integer>hashMap = new HashMap<Integer, Integer>();

        int result = 0;

        for (int item : A) {

            if(hashMap.containsKey(item)){
                int newCount = hashMap.get(item) + 1;
                hashMap.put(item, newCount);

                if(newCount%2 == 0){
                    result -= item;
                }else{
                    result += item;
                }
            }else{
                hashMap.put(item, 1);
                result +=item;
            }
        }

        return  result;
    }

    public static void main(String[] args) {
        System.out.println(getOddOccurence(new int[] {9,3,9,3,9,7,9}));
    }
}
