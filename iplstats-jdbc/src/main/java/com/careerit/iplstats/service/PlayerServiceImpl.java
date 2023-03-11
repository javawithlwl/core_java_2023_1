package com.careerit.iplstats.service;

import com.careerit.iplstats.dao.PlayerDao;
import com.careerit.iplstats.dao.PlayerDaoImpl;
import com.careerit.iplstats.domain.Player;

import java.io.File;
import java.util.List;

public class PlayerServiceImpl implements  PlayerService{

  private PlayerDao playerDao;

  public PlayerServiceImpl(){
      this.playerDao = new PlayerDaoImpl();
  }
  @Override
  public int addPlayer(Player player) {
    return 0;
  }

  @Override
  public Player updatePlayer(Player player) {
    return null;
  }

  @Override
  public Player getPlayer(int id) {
    return null;
  }

  @Override
  public boolean deletePlayer(int id) {
    return false;
  }

  @Override
  public int addPlayers(List<Player> players) {
    return 0;
  }

  @Override
  public List<Player> getPlayers() {
    return null;
  }

  @Override
  public File export() {
    return null;
  }
}
