package com.ashen.leaguemanager.presistence;

import com.ashen.leaguemanager.model.League;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeagueRepository extends MongoRepository<League,String> {
}
