package com.ashen.leaguemanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SportsClub{
    private String masterId;
    private String nameOfClub;
    private String clubLocation;
    private String nameOfOwner;
    private String startDate;
    private List<String> leagues;

}
