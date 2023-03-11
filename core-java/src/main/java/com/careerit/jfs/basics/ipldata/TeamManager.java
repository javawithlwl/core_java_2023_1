package com.careerit.jfs.basics.ipldata;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class TeamManager {

  public static void main(String[] args) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    TeamDetailWrapper teamWrapper = objectMapper.readValue(TeamManager.class.getResourceAsStream("/team_data.json"), TeamDetailWrapper.class);
    List<TeamDetails> teamsList = teamWrapper.getTeams();
    System.out.println("Total team count :"+teamsList.size());

    teamsList.stream().forEach(team->{
      System.out.println("-".repeat(20));
      System.out.println(team.getTeamName());
      List<RoleDetails> roles = team.getRoleDetailsList();
      roles.stream().forEach(ele->{
        System.out.println(ele.getRoleName());
        List<Player> players = ele.getPlayerList();
        players.stream().forEach(p->{
          System.out.println(p.getName());
          System.out.println(p.getCountry());
          System.out.println(p.getAmount());
          System.out.println("-".repeat(20));
        });
      });
    });
  }
}
