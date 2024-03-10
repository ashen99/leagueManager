package com.ashen.leaguemanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "football-club")
public class FootballClub extends SportsClub{
    @Id
    private String id;
    private int wins;
    private int defeats;
    private int draws;
    private int numOfGoalsScored;
    private int points;
    private int numOfGoalsRecived;
    private int numberOfMatches;
    private int goalDifference;
}
