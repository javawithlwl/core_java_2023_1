package com.careerit.iplstats.service;

import com.careerit.iplstats.dao.IplStatDao;
import com.careerit.iplstats.dao.IplStatDaoImpl;
import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleStatDto;
import com.careerit.iplstats.dto.TeamStatDto;

import java.util.List;

public class IplStatServiceImpl implements  IplStatService{

  private IplStatDao iplStatDao;

  public IplStatServiceImpl(){
      this.iplStatDao = new IplStatDaoImpl();
  }

  @Override
  public List<Player> getPlayers() {
    return iplStatDao.selectPlayers();
  }

  @Override
  public List<TeamStatDto> getTeamStats() {
    return iplStatDao.selectTeamStats();
  }

  @Override
  public List<RoleStatDto> getRoleStatsOfTeam(String team) {
    return null;
  }

  @Override
  public List<String> getTeamNames() {
    return iplStatDao.selectTeamNames();
  }

  @Override
  public List<String> getCountryNames() {
    return null;
  }

  @Override
  public List<Player> getPlayerByCountry(String country) {
    return null;
  }

  @Override
  public List<Player> getPlayerByTeamAndRole(String team, String role) {
    return null;
  }

  @Override
  public List<Player> search(String str) {
    return null;
  }

  @Override
  public List<Player> getMaxPaidPlayersOfEachTeam() {
    return null;
  }
}
