public class Solution {

    static  Boolean isPossibleInNSteps(int steps, int x, int y){
        int shortestPossibleDistance  = (Math.abs(x) + Math.abs(y));
        return (steps >= shortestPossibleDistance && (steps - (shortestPossibleDistance))%2== 0) ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(isPossibleInNSteps(2,0,0));
        System.out.println(isPossibleInNSteps(3,1,1));
    }
}
