package xyz.aqlabs.NodeChecker.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.aqlabs.NodeChecker.Models.Stats;
import xyz.aqlabs.NodeChecker.Services.StatsService;


@RestController
@RequestMapping("/node/stats")
public class StatsController {

    StatsService statsService = new StatsService();

    @GetMapping
    public Stats getStats(){
        return statsService.getStats();
    }


}
