import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            double value = sc.nextDouble();
            if (value > 0 && value < 1000000.00) {
                Finances finances = new Finances(value);
                finances.countValue();
            }
        } catch (Exception e){
            System.out.println("Invalid Argument");
        }
        sc.close();
    }

}
