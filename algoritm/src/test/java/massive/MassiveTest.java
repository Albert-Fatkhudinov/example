package massive;

import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveTest {

    @Test
    public void checkSortArrayLength() {
        Massive massive = new Massive();
        massive.checkSortArrayLength(new int[]{2, 1, 4, 1, 2, 3, 4, 5, 6, 7, 3, 1});
        massive.checkSortArrayLength(new int[]{2, 1, 4, 1, 2, 3, 4, 5, 6,
                                              7, 7, 7, 7, 7, 7, 3, 1, 8,
                                              8, 8, 8, 8, 8, 8, 8, 8, 8,
                                              8, 8, 8, 8, 8, 8, 8, 8, 8,
                                              8, 8, 8, 8, 8, 8});
    }
}