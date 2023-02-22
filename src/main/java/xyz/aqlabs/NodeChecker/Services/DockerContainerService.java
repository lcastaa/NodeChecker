package xyz.aqlabs.NodeChecker.Services;

import org.springframework.stereotype.Component;
import xyz.aqlabs.NodeChecker.Models.DockerContainer;

import java.util.ArrayList;
import java.util.List;

@Component
public class DockerContainerService {

    public final static String CMD = "sudo docker container ls";

    public List<DockerContainer> getContainer(){
        List<DockerContainer> dockerContainerList = new ArrayList<>();
        try {

            List<String> stringList = CommandRunnerService.runCommand(CMD);

            for (int i = 1; i < stringList.size(); i++){
                String[] stringArr = stringList.get(i).split("   ");
                DockerContainer dockerContainer = new DockerContainer(stringArr[0],stringArr[1],stringArr[2],stringArr[3],stringArr[4]);
                dockerContainerList.add(dockerContainer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dockerContainerList;

    }


}
