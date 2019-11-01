package CreationalPatterns.Singleton.CommandHistory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jakob S. Larsen on 11/09/2019.
 */

public class CommandHistory {
    private static CommandHistory instance;
    private List<String> history = Collections.synchronizedList(new ArrayList<>());

    private CommandHistory() {}

    public synchronized static CommandHistory getInstance() {
        if (instance == null) {
            instance = new CommandHistory();
        }
        return instance;
    }

    public void addCommand(String command) {
        history.add(command);
    }

    public void printHistory() {
        System.out.println("Command History:");
        for (String command: history) {
            System.out.println(command);
        }
    }
}