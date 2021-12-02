package day_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolutionTwo {

    public int solve() throws Exception {
        File data = new File("data/day_two/input.txt");
        Scanner sc = new Scanner(data);
        String command;
        String[] commandSplit;
        String commandWord;
        int commandArg;
        int horizontalPosition = 0;
        int depth = 0;
        while (sc.hasNextLine()) {
            command = sc.nextLine();
            commandSplit = command.split(" ");
            commandWord = commandSplit[0];
            commandArg = Integer.parseInt(commandSplit[1]);
            switch (commandWord) {
            case "forward" :
                horizontalPosition += commandArg;
                break;
            case "up" :
                depth -= commandArg;
                break;
            case "down" :
                depth += commandArg;
                break;
            }
        }

        return horizontalPosition * depth;
    }

    public static void main(String[] args) throws Exception {
        SolutionTwo s = new SolutionTwo();
        System.out.println(s.solve());
    }
}
