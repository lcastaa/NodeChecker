package xyz.aqlabs.NodeChecker.Models;

public class DockerContainer {

    private String container;
    private String image;
    private String command;
    private String created;
    private String status;

    public DockerContainer() {}

    public DockerContainer(String container, String image, String command, String created, String status) {
        this.container = container;
        this.image = image;
        this.command = command;
        this.created = created;
        this.status = status;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
