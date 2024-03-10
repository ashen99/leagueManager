package com.ashen.leaguemanager.services;

import com.ashen.leaguemanager.model.FootballClub;
import com.ashen.leaguemanager.presistence.FootballClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
public class FootballClubService {
    private final FootballClubRepository footballClubRepository;

    @Autowired
    public FootballClubService(final FootballClubRepository footballClubRepository){
        this.footballClubRepository = footballClubRepository;
    }

    public FootballClub findClubByMasterId(final String id){
        return footballClubRepository.findByMasterId(id);
    }

    public FootballClub updateFootballClub(FootballClub footballClub,final String id){
        if(Objects.nonNull(id)){
            FootballClub currentClub = findClubByMasterId(id);
            
        }
    }

    public FootballClub addFootballClub(FootballClub footballClub){
        if(Objects.nonNull(footballClub)){
            footballClub.setMasterId(UUID.randomUUID().toString());
            return footballClubRepository.save(footballClub);
        }else {
            throw new RuntimeException("Club save failed");
        }
    }
}
