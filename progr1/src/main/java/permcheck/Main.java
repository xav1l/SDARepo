package permcheck;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(solution(A));
    }

    // do przerobienia
    public static int solution(int[] A) {

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length) return 0;
        }
        return 1;
    }
}


