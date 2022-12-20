import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Converter {
    private static int odds;
    private static int evens;
    private static int[] nums;

    private Integer[]oddsArr;

    private Integer[]evensArr;

    public Converter(int N) {
        nums = new int[N];
    }

    public void getArgs(int n, Scanner sc){
        int i = 0;

        while (i < n){
            nums[i] = sc.nextInt();
            if (nums[i] < 1 || nums[i] > Math.pow(10, 5))
                System.out.println("invalid argument");
            else
                i++;
        }
    }

    public void defineOdsEvensSize() {
        odds = 0;
        evens = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                odds++;
            else
                evens++;
        }
    }

    public void transferDataToArray(){
        oddsArr = new Integer[odds];
        evensArr = new Integer[evens];
        int j = 0;
        int k = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                oddsArr[j++] = num;
            } else {
                evensArr[k++] = num;
            }
        }
    }

    public void sortingArrays(){
        Arrays.sort(oddsArr);
        Arrays.sort(evensArr, Collections.reverseOrder());
    }
    public Integer[] getOddsArr() {
        return oddsArr;
    }

    public Integer[] getEvensArr() {
        return evensArr;
    }
}
