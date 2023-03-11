package com.careerit.iplstats.dao;

public final class IplStatQuery {

  public static final String GET_TEAM_NAMES="select distinct(team) as team_name from player";
  public static final String GET_PLAYERS = "select id,name,role,country,team,amount from player";
  public static final String SEARCH_BY_NAME="""
                select id,name,role,country,team,amount from player 
                where lower(name) like ?
              """;
  public static final String GET_TEAM_STATS= """
              select team,sum(amount) as total_amount,min(amount) as min_amount, max(amount) as max_amount, count(1) as count, avg(amount) avg_amount from player group by team;
            """;

  private IplStatQuery(){}
}
