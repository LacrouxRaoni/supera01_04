public class NumEntity {
    private int k;
    private int[] arr;

    public NumEntity(int k, int n) {
        this.k = k;
        this.arr = new int[n];
    }

    public int getK() {
        return k;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int arr, int i) {
        this.arr[i] = arr;
    }

    public void doTheMath() {
        int i = 0;
        for (int j : getArr()) {
            for (int value : getArr()) {
                if (j - value == getK()) {
                    i++;
                }
            }
        }
        System.out.println(i);
    }
}
