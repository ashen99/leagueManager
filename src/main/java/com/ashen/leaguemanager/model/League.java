package com.ashen.leaguemanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Document(collection = "leagues")
public class League {
    private String masterId;
    private String leagueName;
    private String startDate;
    private String country;
    private Integer numberOfTeams;
}
