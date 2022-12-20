public class Finances {
    private final Double []moneyBillArr = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00,
                                            1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

    private Double value;

    public Finances(Double value) {
        this.value = value;
    }
    public void countValue()
    {
        int i = 0;
        while (i < 12) {
            value = converter(value, moneyBillArr[i]);
            i++;
        }
    }
    private static Double converter(Double value, Double moneyBill) {
        double tmp = 0.0;
        int i = 0;
        while ((tmp + moneyBill) < value)
        {
            tmp += moneyBill;
            i++;
        }
        messagePrinter(i, moneyBill);
        return value - tmp;
    }
    private static void messagePrinter(int i, Double moneyBill) {
        if (moneyBill == 100.00)
            System.out.println("NOTAS: ");
        else if (moneyBill == 1.00)
            System.out.println("MOEDAS: ");
        if (moneyBill > 1.00)
            System.out.printf("%d nota(s) de R$ %.2f\n", i, moneyBill);
        else
            System.out.printf("%d moeda(s) de R$ %.2f\n", i, moneyBill);
    }
}
