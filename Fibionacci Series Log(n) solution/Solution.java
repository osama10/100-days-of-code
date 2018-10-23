import java.math.BigInteger;

public class Main {

    static public BigInteger [][] matrixMultiplication(BigInteger arr1[][], BigInteger arr2[][]){
        BigInteger a00 =  arr1[0][0].multiply(arr2[0][0]).add(arr1[0][1].multiply(arr2[1][0]));
        BigInteger a01 =  arr1[0][0].multiply(arr2[0][1]).add(arr1[0][1].multiply(arr2[1][1]));
        BigInteger a10 =  arr1[1][0].multiply(arr2[0][0]).add(arr1[1][1].multiply(arr2[1][0]));
        BigInteger a11 =  arr1[1][0].multiply(arr2[0][1]).add(arr1[1][1].multiply(arr2[1][1]));

        return  new BigInteger[][]{{a00,a01},{a10,a11}};
    }

    static public BigInteger[][] powerOf2(BigInteger baseArray[][], int  n){
        BigInteger [][] fibMatrix = new BigInteger[][]{{BigInteger.valueOf(1),BigInteger.valueOf(1)}, {BigInteger.valueOf(1),BigInteger.valueOf(0)}};
        if(n<=1)
            return baseArray;
        baseArray = powerOf2(baseArray, n/2);
        baseArray = matrixMultiplication(baseArray,baseArray);
        if(n%2 != 0)
            baseArray = matrixMultiplication(baseArray,fibMatrix);

        return baseArray;

    }

     public static BigInteger getFib(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n);

         BigInteger [][] fibMatrix = new BigInteger[][]{{BigInteger.valueOf(1),BigInteger.valueOf(1)}, {BigInteger.valueOf(1),BigInteger.valueOf(0)}};

         BigInteger ans = powerOf2(fibMatrix,n-1)[0][0];

        return ans;
    }


    public static void main(String[] args) {

        System.out.println(getFib(36));

    }
}
