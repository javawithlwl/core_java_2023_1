package com.careerit.jfs.basics.day14.iplstat;

import java.util.List;

public class IplStatDriver {

  public static void main(String[] args) throws Exception {

    // Get team names
    IplStatService service = new IplStatService();
    List<String> teamNames = service.getTeamNames();
    System.out.println(teamNames);

    // Get player of given team

    String team = "CSK";
    List<Player> teamPlayers = service.getPlayersOf(team);
    System.out.println("Team "+team+" has "+teamPlayers.size()+" players");

    // Get team amount stats
    List<TeamAmountDto> teamAmountList = service.getTeamAmountStats();
    System.out.println(teamAmountList);

  }
}
