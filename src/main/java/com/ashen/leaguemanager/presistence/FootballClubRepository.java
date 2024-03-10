package com.ashen.leaguemanager.presistence;

import com.ashen.leaguemanager.model.FootballClub;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FootballClubRepository extends MongoRepository<FootballClub,String> {
    FootballClub findByMasterId(String masterId);
}
