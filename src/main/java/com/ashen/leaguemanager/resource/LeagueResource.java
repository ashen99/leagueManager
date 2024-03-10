package com.ashen.leaguemanager.resource;

import com.ashen.leaguemanager.model.League;
import com.ashen.leaguemanager.services.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/leagues")
public class LeagueResource {

    private final LeagueService leagueService;

    @Autowired
    public LeagueResource(final LeagueService leagueService){
        this.leagueService = leagueService;
    }

    @GetMapping("/getLeagues")
    public List<League> getLeagues(){
        return leagueService.findAllLeagues();
    }

    @PostMapping("/addLeague")
    public League addLeague(@RequestBody League league){
        return leagueService.saveLeague(league);
    }

    @DeleteMapping("/remove-league")
    public void removeLeague(@PathVariable final String id){
        leagueService.removeLeague(id);
    }
}
