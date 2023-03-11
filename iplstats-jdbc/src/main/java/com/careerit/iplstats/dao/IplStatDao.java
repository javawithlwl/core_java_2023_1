package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleStatDto;
import com.careerit.iplstats.dto.TeamStatDto;

import java.util.List;

public interface IplStatDao {
  List<Player> selectPlayers();
  List<TeamStatDto> selectTeamStats();
  List<RoleStatDto> selectRoleStatsOfTeam(String team);
  List<String> selectTeamNames();
  List<String> selectCountryNames();
  List<Player> selectPlayerByCountry(String country);
  List<Player> selectPlayerByTeamAndRole(String team,String role);
  List<Player> search(String str);
  List<Player> selectMaxPaidPlayersOfEachTeam();
}
