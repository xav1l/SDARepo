package binarygap;

public class Solution {

    public static int solution(int N) {
        int check = 0;
        int current = 0;
        boolean q = false;

        while (N > 0) {
            int bit = N % 2;

            if (bit == 0) {
                if (q) {
                    current++;
                }

            } else {
                q = true;
                if (current > check) {
                    check = current;
                }
                current = 0;
            }
            N = N / 2;
        }


        return check;
    }

    public static void main(String[] args) {
        System.out.println(solution1(1041));
    }

    public static int solution1(int n) {        //z neta
        int maxGap = 0;
        int priorIndex1 = 0;

        while (n != 0) {
            int index1 = Integer.numberOfTrailingZeros(n);
            int zeroGap = index1 - priorIndex1 - 1;
            if (zeroGap > maxGap) {
                maxGap = zeroGap;
            }
            priorIndex1 = index1;
            n &= n - 1; // Remove the lowest bit;
        }
        return maxGap;
    }
}
