import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J08011_Corrected {

    // A helper class to store info about our numbers
    static class NumberInfo {
        String value;
        int count;
        int firstIndex; // The original input order

        public NumberInfo(String value, int count, int firstIndex) {
            this.value = value;
            this.count = count;
            this.firstIndex = firstIndex;
        }
    }

    // Helper function to check if a number's digits are non-decreasing
    public static boolean isNonDecreasing(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            // Use charAt() for efficient character comparison
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Map to store frequency: "123" -> 2
        Map<String, Integer> frequency = new HashMap<>();
        // Map to store first appearance: "123" -> 1 (index)
        Map<String, Integer> firstIndex = new HashMap<>();

        int index = 0; // Current input order
        while (scanner.hasNext()) {
            String val = scanner.next();
            index++; // Increment order counter

            // Only process valid numbers
            if (isNonDecreasing(val)) {
                // Increment the frequency count
                frequency.put(val, frequency.getOrDefault(val, 0) + 1);

                // If this is the first time we've seen this number,
                // record its index.
                firstIndex.putIfAbsent(val, index);
            }
        }

        // Now, create a list of anly the *unique* valid numbers
        ArrayList<NumberInfo> results = new ArrayList<>();
        for (String val : frequency.keySet()) {
            results.add(new NumberInfo(
                    val,
                    frequency.get(val),
                    firstIndex.get(val)));
        }

        // Sort the list
        Collections.sort(results, (a, b) -> {
            // Compare by frequency (descending)
            int freqCompare = Integer.compare(b.count, a.count);
            if (freqCompare != 0) {
                return freqCompare;
            }
            // If frequencies are equal, compare by first index (ascending)
            return Integer.compare(a.firstIndex, b.firstIndex);
        });

        // Print the final, sorted, unique results
        for (NumberInfo info : results) {
            System.out.printf("%s %d\n", info.value, info.count);
        }
    }
}