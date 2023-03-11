package com.careerit.jfs.basics.collections.map;

import com.careerit.jfs.basics.day14.iplstat.Player;
import com.careerit.jfs.basics.day14.iplstat.PlayerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerStatsExamples {

  public static void main(String[] args) {
    PlayerService playerService = new PlayerService();
    List<Player> list = playerService.getPlayers();
    Map<String, List<Player>> teamMap = new HashMap<>();
    for (Player player : list) {
      String team = player.getTeam();
      List<Player> tempList = teamMap.getOrDefault(team, new ArrayList<>());
      tempList.add(player);
      teamMap.put(team, tempList);
    }
    teamMap.get("MI").stream().forEach(ele->{
      System.out.println(ele.getName());
    });


  }
}
