package xyz.aqlabs.NodeChecker.Models;


public class Stats {

    private Temp temp;
    private Uptime uptime;
    private Storage storage;

    public Stats(Temp temp, Uptime uptime, Storage storage) {
        this.temp = temp;
        this.uptime = uptime;
        this.storage = storage;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Uptime getUptime() {
        return uptime;
    }

    public void setUptime(Uptime uptime) {
        this.uptime = uptime;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
