package xyz.aqlabs.NodeChecker.Services;

import xyz.aqlabs.NodeChecker.Models.Stats;
import xyz.aqlabs.NodeChecker.Models.Storage;
import xyz.aqlabs.NodeChecker.Models.Temp;
import xyz.aqlabs.NodeChecker.Models.Uptime;

public class StatsService {

    private final static String CMD1 = "vcgencmd measure_temp";
    private final static String CMD2 = "uptime -p";
    private final static String CMD3 = "df -h";



    public Stats getStats(){
        Stats stats = new Stats(tempConvert(),upTime(),currentStorage());
        return stats;
    }

    private Storage currentStorage(){
        Storage storage = new Storage(CommandRunnerService.runCommand(CMD3));
        return storage;
    }

    private Uptime upTime(){
        String[] stringArr = CommandRunnerService.runCommand(CMD2).get(0).split(",");
        Uptime uptime = new Uptime(stringArr[0],stringArr[1],stringArr[2],stringArr[3]);
        return uptime;
    }

    private Temp tempConvert(){
        String nums = CommandRunnerService.runCommand(CMD1).get(0).replace("temp=","").replace("'C","");
        double doubleNums = Double.parseDouble(nums) * 1.8 + 32;
        nums = doubleNums + "'F";
        Temp temp = new Temp(nums);
        return temp;
    }





}
