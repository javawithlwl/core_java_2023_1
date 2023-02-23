package com.careerit.jfs.basics.collections.playerstats;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerServiceImpl implements PlayerService {

  private List<Player> players;
  private Map<String, List<Player>> map;

  public PlayerServiceImpl() {
    players = CsvReaderUtil.loadDataFromCsv();
    map = players.stream().collect(Collectors.groupingBy(Player::getTeam));
  }

  @Override
  public List<String> getPlayerNames() {
    List<String> list = players.stream().map(ele -> ele.getName()).collect(Collectors.toList());
    System.out.println("Total player count is " + list.size());
    return list;
  }

  @Override
  public List<String> getTeamNames() {
    return null;
  }

  @Override
  public List<Player> getPlayerByTeam(String team) {
    return null;
  }

  @Override
  public List<Player> getPlayerByRole(String role) {
    return null;
  }

  @Override
  public List<TeamStatsDto> getTeamStats() {
    return null;
  }

  @Override
  public List<Player> getMaxPaidPlayers() {
    return null;
  }

  @Override
  public List<Player> getMaxPaidPlayers(String team) {
    return null;
  }

  @Override
  public List<Player> getMaxPaidPlayers(String team, String role) {
    List<Player> players = map.get(team);
    List<Player> playersByRoleList = players.stream().filter(p -> p.getRole().equals(role)).collect(Collectors.toList());
    double maxAmount = getMaxAmount(playersByRoleList);
    List<Player> maxPaidPlayers = playersByRoleList.stream().filter(p -> p.getAmount() == maxAmount).collect(Collectors.toList());
    return maxPaidPlayers;
  }

  private double getMaxAmount(List<Player> playersByRoleList) {
    double max = playersByRoleList.get(0).getAmount();
    for (Player player : playersByRoleList) {
      double amount = player.getAmount();
      if (amount > max) {
        max = amount;
      }
    }
    return max;
  }

  @Override
  public List<String> getCountryNames() {
    return null;
  }

  @Override
  public List<CountryStatsDto> getPlayerCountryStats() {
    return null;
  }
}
