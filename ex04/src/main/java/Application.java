import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = null;
        int n = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        Printer printer = new Printer(n);
        for (int i = 0; i < n; i++){
            message = sc.nextLine();
            if (message.length() > 1 &&  message.length() < 101 && message.length() % 2 == 0){
                 printer.setMessage(message, i);
            }
        }
        printer.printMessage();
        sc.close();
    }
}
