package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleStatDto;
import com.careerit.iplstats.dto.TeamStatDto;

import java.util.List;

public interface IplStatService {

    List<Player> getPlayers();
    List<TeamStatDto> getTeamStats();
    List<RoleStatDto> getRoleStatsOfTeam(String team);
    List<String> getTeamNames();
    List<String> getCountryNames();
    List<Player> getPlayerByCountry(String country);
    List<Player> getPlayerByTeamAndRole(String team,String role);
    List<Player> search(String str);
    List<Player> getMaxPaidPlayersOfEachTeam();
}
