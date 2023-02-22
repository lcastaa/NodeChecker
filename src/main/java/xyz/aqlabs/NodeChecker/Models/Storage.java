package xyz.aqlabs.NodeChecker.Models;

import java.util.List;

public class Storage {

    private List<String> info;

    public Storage(List<String> info) {
        this.info = info;
    }

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }
}
