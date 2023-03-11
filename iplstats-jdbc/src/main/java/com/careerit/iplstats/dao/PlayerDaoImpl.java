package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;

import java.util.List;

public class PlayerDaoImpl implements  PlayerDao{
  @Override
  public int insertPlayer(Player player) {
    return 0;
  }

  @Override
  public Player updatePlayer(Player player) {
    return null;
  }

  @Override
  public Player selectPlayer(int id) {
    return null;
  }

  @Override
  public boolean deletePlayer(int id) {
    return false;
  }

  @Override
  public int insertPlayer(List<Player> players) {
    return 0;
  }

  @Override
  public List<Player> selectPlayers() {
    return null;
  }
}
