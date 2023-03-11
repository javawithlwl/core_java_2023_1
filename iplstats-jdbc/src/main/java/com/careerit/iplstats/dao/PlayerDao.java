package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;

import java.util.List;

public interface PlayerDao {

      int insertPlayer(Player player);
      Player updatePlayer(Player player);
      Player selectPlayer(int id);
      boolean deletePlayer(int id);
      int insertPlayer(List<Player> players);
      List<Player> selectPlayers();
}
