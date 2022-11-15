public class EvenIterator {
    public void numberIterator() {
        int[] numbers = {12, 8, 2, 23, 4, 1, 3, 5, 6, 7};


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
