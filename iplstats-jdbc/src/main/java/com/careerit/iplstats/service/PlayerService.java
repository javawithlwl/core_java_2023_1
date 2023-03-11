package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;

import java.io.File;
import java.util.List;

public interface PlayerService {
  int addPlayer(Player player);
  Player updatePlayer(Player player);
  Player getPlayer(int id);
  boolean deletePlayer(int id);
  int addPlayers(List<Player> players);
  List<Player> getPlayers();
  File export();
}
