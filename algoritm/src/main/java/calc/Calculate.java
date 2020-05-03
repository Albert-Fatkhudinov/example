package calc;

public class Calculate {

    void calculateAndPrint(int n) {
        int number = 0;
        if (n >= 1000 && n <= 10000) {
            number = n % 1000;
            number = number / 100;
            if (number % 2 == 0) {
                n += 100;
            } else {
                n *= 2;
            }
            System.out.println(n);
        }
    }

}
