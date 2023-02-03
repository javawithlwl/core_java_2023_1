package com.careerit.jfs.basics.day14.iplstat;

public class TeamDetail {

  private String team;
  private String name;
  private String captain;

  public TeamDetail(String team, String name, String captain) {
    this.team = team;
    this.name = name;
    this.captain = captain;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCaptain() {
    return captain;
  }

  public void setCaptain(String captain) {
    this.captain = captain;
  }
}
