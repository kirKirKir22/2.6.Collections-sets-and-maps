import java.util.*;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }


    public static void printOddNumbers(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void printUniqueNumbers(List<Integer> nums) {
        Set<Integer> uniqueEvenNumbers = new HashSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }

        Set<Integer> sortedUniqueEvenNumbers = new TreeSet<>(uniqueEvenNumbers);
        for (int num : sortedUniqueEvenNumbers) {
            System.out.print(num + " ");
        }

    }

    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }

    }

    public static void printNumberOfDuplicates(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);
        System.out.println(" ");

    }

    private static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printUniqueNumbers(nums);
        System.out.println(" ");

    }

    private static void task3() {
        System.out.println("Задача 3");
        List<String> words = new ArrayList<>(List.of("яблоко", "солнце", "кошка", "дом", "птица", "книга",
                "цветок", "море", "дерево", "компьютер",
                "солнце", "дом", "книга", "дерево", "солнце"));
        printUniqueWords(words);
        System.out.println(" ");

    }

    private static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один",
                "два", "два",
                "три", "три", "три",
                "четыре", "четыре", "четыре", "четыре"));
        printNumberOfDuplicates(strings);

    }
}