package com.careerit.iplstats.dao;

public final class IplStatQuery {

  public static final String GET_TEAM_NAMES="select distinct(team) as team_name from player";
  public static final String GET_PLAYERS = "select id,name,role,country,team,amount from player";
  public static final String SEARCH_BY_NAME="""
              select id,name,role,country,team,amount from player 
              where lower(name) like ?
              """;


  private IplStatQuery(){}
}
