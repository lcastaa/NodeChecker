package xyz.aqlabs.NodeChecker.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.aqlabs.NodeChecker.Models.DockerContainer;
import xyz.aqlabs.NodeChecker.Services.DockerContainerService;

import java.util.List;

@RestController
@RequestMapping(path = "/node/docker")
public class DockerContainerController {


    DockerContainerService dockerContainerService = new DockerContainerService();

    @GetMapping
    public List<DockerContainer> getContainer(){
        return dockerContainerService.getContainer();
    }




}
