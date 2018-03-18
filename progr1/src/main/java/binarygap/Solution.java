package binarygap;

public class Solution {

    private static int solution(int N) {  //zrobione na zajęciach przez prowadzącego
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
        System.out.println(solution(51712));
    }

}
