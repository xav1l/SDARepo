package zad_rozgrz_18_3_2018;

public class Main {

    private static boolean checkSum(int[] A) {
        int sum = A[0] + A[A.length - 1];

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] == sum) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {3, 3, 5, 8, 1};
        System.out.println(checkSum(array));
    }
}
