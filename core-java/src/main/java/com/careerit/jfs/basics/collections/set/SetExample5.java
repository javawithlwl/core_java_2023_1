package com.careerit.jfs.basics.collections.set;

import com.careerit.jfs.basics.day14.iplstat.Player;
import com.careerit.jfs.basics.day14.iplstat.PlayerService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample5 {
  public static void main(String[] args) {
    PlayerService playerService = new PlayerService();
    List<Player> list = playerService.getPlayers();


//    Set<String> countryNames = new HashSet<>();
//    for(Player player:list){
//        countryNames.add(player.getCountry());
//    }
      Set<String> countryNames=list.stream()
                                   .map(ele->ele.getCountry())
                                   .collect(Collectors.toSet());
      System.out.println(countryNames);

    // Get unique country names
    // Get unique team name

//    Set<String> teamNames = new HashSet<>();
//    for(Player player:list){
//        teamNames.add(player.getTeam());
//    }
    Set<String> teamNames = list.stream().map(player->player.getTeam()).collect(Collectors.toSet());
    System.out.println(teamNames);

    Set<Player> players=new HashSet<>();
    players.addAll(list);
    System.out.println(players.size());

  }
}
