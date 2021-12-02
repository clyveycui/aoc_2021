package day_one;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public int solve() throws FileNotFoundException {
        File data = new File("data/day_one/input.txt");
        Scanner sc = new Scanner(data);
        int previous = sc.nextInt();
        int next;
        int count = 0;
        while (sc.hasNextInt()) {
            next = sc.nextInt();
            if (next > previous) {
                count++;
            }
            previous = next;
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        System.out.println(s.solve());
    }
}
