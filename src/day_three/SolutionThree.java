package day_three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolutionThree {
    public int solve() throws FileNotFoundException {
        File data = new File("data/day_three/input.txt");
        Scanner sc = new Scanner(data);
        String reading = sc.nextLine();
        int length = reading.length();
        int[] oneFrequency = new int[reading.length()];
        for (int i = 0; i < length; i++) {
            oneFrequency[i] += Character.getNumericValue(reading.charAt(i));
        }
        int count = 1;
        while (sc.hasNextLine()) {
            reading = sc.nextLine();
            for (int i = 0; i < length; i++) {
                oneFrequency[i] += Character.getNumericValue(reading.charAt(i));
            }
            count++;

        }

        int half = count / 2;
        int gamma = 0;
        int epsilon = 0;
        int twoPower = 1;
        for (int i = length - 1; i >= 0; i--) {
            if (oneFrequency[i] > half) {
                gamma += twoPower;
            } else {
                epsilon += twoPower;
            }
            twoPower *= 2;
        }

        return gamma * epsilon;
    }


    public static void main(String[] args) throws Exception {
        SolutionThree s = new SolutionThree();
        System.out.println(s.solve());
    }
}
