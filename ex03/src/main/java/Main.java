import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        NumEntity num = new NumEntity(k, n);
        getArrayValues(num, sc, n);
        num.doTheMath();
        sc.close();
    }

    private static void getArrayValues(NumEntity num, Scanner sc, int n) {
        for (int i = 0; i < n; i++) {
            num.setArr(sc.nextInt(), i);
        }
    }
}
