import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        Main main = new Main();
        int result = main.calculateSumOfEvenNumbers(4000000);
        System.out.println(result);

    }

    int calculateSumOfEvenNumbers(int maxTermValue) { //maxTermValue z wyłączeniem tej wartości

        int sum = 0;
        int a = 0;
        int b = 1;


        for (int c = 1; c <= maxTermValue; c++) {

            c = b + a;
            if (c % 2 == 0) {
                sum = sum + c;
            }
            a = b;
            b = c;
            c = b + a;

        }

        return sum;
    }
}
