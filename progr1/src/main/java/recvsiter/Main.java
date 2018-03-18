package recvsiter;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibIter(48));
    }

    private static int fibIter(int n) {
        int f1 = 1;
        int f2 = 1;

        while(n > 2) {
            int temp = f2;
            f2 = f1 + f2;
            f1 = temp;
            n--;
        }

        return f2;
    }

}
