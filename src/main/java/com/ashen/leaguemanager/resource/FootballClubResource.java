package com.ashen.leaguemanager.resource;

import com.ashen.leaguemanager.model.FootballClub;
import com.ashen.leaguemanager.services.FootballClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/sports-club")
public class FootballClubResource {
    private final FootballClubService footballClubService;

    @Autowired
    public FootballClubResource(final FootballClubService footballClubService){
        this.footballClubService = footballClubService;
    }

    @PutMapping("/update-club/{id}")
    public FootballClub updateFootballClub(@PathVariable final String id ,@RequestBody FootballClub footballClub){

    }

    @PostMapping("/add-club")
    public FootballClub addFootballClub(@RequestBody FootballClub footballClub){
        return footballClubService.addFootballClub(footballClub);
    }
}
