import java.util.ArrayList;

public class PrintUsage {
    ArrayList<String> listHelp;

    public PrintUsage() {
        listHelp = new ArrayList<>();
        listHelp.add("\nCommand Line Todo application");
        listHelp.add("=============================");
        listHelp.add("\n-l   Lists all the tasks");
        listHelp.add("-a   Adds a new task");
        listHelp.add("-r   Removes an task");
        listHelp.add("-c   Completes an task  - not done yet");
        listHelp.add("-u   [id] Update task description    - not done yet");
    }

    public void printHelp() {
        for (int i = 0; i < listHelp.size(); i++) {
            System.out.println(listHelp.get(i));
        }
    }
}