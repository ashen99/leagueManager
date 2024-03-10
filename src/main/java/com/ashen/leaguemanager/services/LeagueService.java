package com.ashen.leaguemanager.services;

import com.ashen.leaguemanager.model.League;
import com.ashen.leaguemanager.presistence.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    @Autowired
    public LeagueService(final LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    /**
     * find all leagues
     */
    public List<League> findAllLeagues() {
        return leagueRepository.findAll();
    }

    /**
     * Save a league
     */
    public League saveLeague(final League league) {
        if(Objects.nonNull(league)){
            league.setMasterId(UUID.randomUUID().toString());
            return leagueRepository.save(league);
        }
        else {
             throw new RuntimeException("No league found");
        }
    }

    /**
     * delete a league
     */
    public void removeLeague(final String id) {
        if (Objects.nonNull(id)) {
            leagueRepository.deleteById(id);
        }
    }

}
