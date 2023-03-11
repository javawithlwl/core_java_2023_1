package com.careerit.jfs.basics.collections.playerstats;


public class PlayerStatManager {

  public static void main(String[] args) {

    PlayerService playerService = new PlayerServiceImpl();
    playerService.getPlayersSortAmount().forEach(p->{
      System.out.println(p);
    });
  }
}
