package CreationalPatterns.Singleton.CommandHistory;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Jakob S. Larsen on 11/09/2019.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(Collections.emptyList());
        boolean exitInput = false;
        Scanner input = new Scanner(System.in);
        CommandHistory cmdHistory = CommandHistory.getInstance();

        while(!exitInput) {
            System.out.print("Enter a command:");
            String nextCommand = input.next();

            cmdHistory.addCommand(nextCommand);

            if (nextCommand.toUpperCase().matches("EXIT")) {
                cmdHistory.printHistory();
                exitInput = true;
            }
        }
    }
}