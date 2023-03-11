package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleStatDto;
import com.careerit.iplstats.dto.TeamStatDto;
import com.careerit.iplstats.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class IplStatDaoImpl implements IplStatDao {
  @Override
  public List<Player> selectPlayers() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    List<Player> playerList = new ArrayList<>();
    try{
        con = ConnectionUtil.getConnection();
        st = con.createStatement();
        rs = st.executeQuery(IplStatQuery.GET_PLAYERS);
        while(rs.next()) {
          Player player = covertToDomain(rs);
          playerList.add(player);
        }
    }catch (SQLException e){

    }finally {
        ConnectionUtil.close(rs,st,con);
    }
    return playerList;
  }

  @Override
  public List<TeamStatDto> selectTeamStats() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    List<TeamStatDto> list = new ArrayList<>();
    try {
      con = ConnectionUtil.getConnection();
      st = con.createStatement();
      rs = st.executeQuery(IplStatQuery.GET_TEAM_STATS);
      while (rs.next()) {
        TeamStatDto teamStatDto = TeamStatDto.builder()
            .team(rs.getString("team"))
            .minAmount(rs.getDouble("min_amount"))
            .maxAmount(rs.getDouble("max_amount"))
            .count(rs.getInt("count"))
            .totalAmount(rs.getDouble("total_amount"))
            .avgAmount(rs.getDouble("avg_amount"))
            .build();
        list.add(teamStatDto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(rs, st, con);
    }
    return list;
  }

  @Override
  public List<RoleStatDto> selectRoleStatsOfTeam(String team) {
    return null;
  }

  @Override
  public List<String> selectTeamNames() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    List<String> teamNamesList = new ArrayList<>();
    try {
      con = ConnectionUtil.getConnection();
      st = con.createStatement();
      rs = st.executeQuery(IplStatQuery.GET_TEAM_NAMES);
      while (rs.next()) {
        String teamName = rs.getString("team_name");
        teamNamesList.add(teamName);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(rs, st, con);
    }
    return teamNamesList;
  }

  @Override
  public List<String> selectCountryNames() {
    return null;
  }

  @Override
  public List<Player> selectPlayerByCountry(String country) {
    return null;
  }

  @Override
  public List<Player> selectPlayerByTeamAndRole(String team, String role) {
    return null;
  }

  @Override
  public List<Player> search(String str) {
    return null;
  }

  @Override
  public List<Player> selectMaxPaidPlayersOfEachTeam() {
    return null;
  }

  private Player covertToDomain(ResultSet rs) {
    Player player = null;
    try {
      int id = rs.getInt("id");
      String name = rs.getString("name");
      String country = rs.getString("country");
      String team = rs.getString("team");
      String role = rs.getString("role");
      double amount = rs.getDouble("amount");
      player = Player.builder()
          .id(id)
          .name(name)
          .country(country)
          .role(role)
          .amount(amount)
          .team(team)
          .build();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return player;
  }
}
