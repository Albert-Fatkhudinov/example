package calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void calculateAndPrint() {
        Calculate calculate = new Calculate();
        calculate.calculateAndPrint(1111);
        calculate.calculateAndPrint(1211);
    }
}