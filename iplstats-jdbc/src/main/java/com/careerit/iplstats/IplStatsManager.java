package com.careerit.iplstats;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.service.IplStatService;
import com.careerit.iplstats.service.IplStatServiceImpl;

import java.util.List;

public class IplStatsManager {

  public static void main(String[] args) {

    IplStatService iplStatService = new IplStatServiceImpl();
    // Get all the team names
    List<String> teamNames = iplStatService.getTeamNames();
    System.out.println(teamNames);

    // Get all the players

    List<Player> playerList = iplStatService.getPlayers();
    System.out.println("Total players :"+playerList.size());
  }
}
