import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt the user for the number of integers
        System.out.print("Enter the number of integers: ");
        int n = in.nextInt();

        // create an array to store the integers
        int[] arr = new int[n];

        // prompt the user for the integers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            arr[i] = in.nextInt();
        }

        // create a HashMap to store the frequency of each integer
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        // find the mode (i.e. the integer with the highest frequency)
        int mode = -1;
        int maxFreq = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxFreq) {
                mode = num;
                maxFreq = freq;
            }
        }

        // print out the mode
        System.out.println("Mode: " + mode);
    }
}
