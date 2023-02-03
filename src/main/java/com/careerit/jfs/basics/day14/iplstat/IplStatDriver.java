package com.careerit.jfs.basics.day14.iplstat;

import java.util.List;

public class IplStatDriver {

  public static void main(String[] args) throws Exception {

    TeamService teamService = new TeamService();
    String team = "RCCB";
    TeamDetail teamDetail = teamService.getTeamDetails(team);
    if(teamDetail!=null) {
      System.out.println(teamDetail.getTeam() + "-" + teamDetail.getName() + "-" + teamDetail.getCaptain());
    }else{
      System.out.println(team+" is not found, please check team label");
    }
    }
}
