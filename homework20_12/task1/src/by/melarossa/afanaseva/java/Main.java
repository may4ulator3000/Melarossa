
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1 Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
        //    Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

        int[] arr = new int[2000];
        Arrays.setAll(arr, i -> generateRandomNumberInRange(31, 49));

        Integer max = Arrays.stream(arr).reduce(Integer::max).orElse(-1);
        System.out.println("максимальное число " + max);
        Integer min = Arrays.stream(arr).reduce(Integer::min).orElse(-1);
        System.out.println("минимальное число " + min);
        Double average = Arrays.stream(arr).average().getAsDouble();
        System.out.println("среднее значение " + average);
    }

    private static int generateRandomNumberInRange(int minBorder, int maxBorder) {
        int random = (int) (Math.random() * ((maxBorder - minBorder) + 1)) + minBorder;
        return random;
    }
}