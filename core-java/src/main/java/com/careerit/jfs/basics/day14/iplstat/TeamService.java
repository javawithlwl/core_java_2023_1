package com.careerit.jfs.basics.day14.iplstat;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeamService {

  private static List<TeamDetail> teamDetails;

  @SneakyThrows
  public TeamService()  {
        teamDetails = loadFromCsv();
  }

  public TeamDetail getTeamDetails(String team){
        for(TeamDetail teamDetail:teamDetails){
            if(teamDetail.getTeam().equalsIgnoreCase(team)){
              return teamDetail;
            }
        }
        return null;
  }
  public List<TeamDetail> getTeamDetails(){
    return teamDetails;
  }

  private List<TeamDetail> loadFromCsv() throws Exception {
    List<TeamDetail> list = new ArrayList<>();
    Path path = new File(TeamService.class.getResource("/team.csv").toURI()).toPath();
    List<String> lines = Files.readAllLines(path);
    for (int i = 1; i < lines.size(); i++) {
      String[] teamData = lines.get(i).split(",");
      String team = teamData[1];
      String name = teamData[0];
      String captain = teamData[2];
      TeamDetail teamDetail = new TeamDetail(team, name, captain);
      list.add(teamDetail);
    }
    return list;
  }
}
