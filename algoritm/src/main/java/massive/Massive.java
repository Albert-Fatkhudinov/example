package massive;

public class Massive {

    public void checkSortArrayLength(int[] array){
        int count = 0;
        int countMax = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i - 1] <= array[i]) {
                count++;
            } else {
                if (countMax <= count) {
                    countMax = count + 1;
                }
                count = 0;
            }
        }
        if (count >= countMax) {
            countMax = count + 1;
        }

        System.out.println(countMax);
    }
}
