public class Solution {

    static void minimumBribes(int[] q) {
        Boolean tooChaotic  = false;
        int minNumberOfBribes = 0;

        for (int i = q.length -1 ; i>-1 ; i--){
            if(q[i] - (i+1) > 2){
                tooChaotic = true;
                break;
            }
            for (int j = Math.max(0,q[i]-2); j<i ; j++){
                if(q[j] > q[i]) {
                    minNumberOfBribes += 1;
                }

            }
        }
        String result = (tooChaotic) ? "Too chaotic"  : minNumberOfBribes + "";
        System.out.println(result);

    }

    public static void main(String[] args) {
        minimumBribes(new int[] {2,1,5,3,4});

    }
}
