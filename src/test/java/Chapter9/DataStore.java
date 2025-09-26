package Chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DataStore {
    static Stream<Integer> randomNumbers() {
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();
        int count = rnd.nextInt(15 - 5) + 5;
        for (int i = 0; i < 15; i++) {
            numbers.add(rnd.nextInt(70 - 10) + 10);
        }
        return numbers.stream();
    }
}
