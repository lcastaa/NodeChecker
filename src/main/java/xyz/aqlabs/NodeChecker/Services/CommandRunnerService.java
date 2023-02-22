package xyz.aqlabs.NodeChecker.Services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandRunnerService {


    public static List<String> runCommand(String cmd) {
        List<String> stringList = new ArrayList<>();

        try {
            Process process = Runtime.getRuntime().exec(cmd);
            Scanner scanner = new Scanner(process.getInputStream());

            while (scanner.hasNextLine()) {
                stringList.add(scanner.nextLine());
            }


        } catch (IOException e) {
            System.out.println("Your system command is --INVALID-- please try again.");
        }

        return stringList;

    }
}
