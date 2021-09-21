package leetCode.jzoffer.t40;

/**
 * @author chj
 * @date 2021/8/16 9:14
 */
public class t32 {

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                String s1 = String.valueOf(numbers[i]) + String.valueOf(numbers[j]);
                String s2 = String.valueOf(numbers[j]) + String.valueOf(numbers[i]);
                if (s1.compareTo(s2) > 0) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result = result.append(numbers[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
