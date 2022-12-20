import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Converter converter = new Converter(n);

        converter.getArgs(n, sc);
        converter.defineOdsEvensSize();
        converter.transferDataToArray();
        converter.sortingArrays();

        //print result
        for (int num: converter.getOddsArr())
            System.out.println(num);
        for (int nun: converter.getEvensArr()){
            System.out.println(nun);
        }
        sc.close();
    }


}
