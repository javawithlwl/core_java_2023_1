package com.careerit.sc.di.stats.service;

import com.careerit.sc.di.stats.domain.Player;
import com.careerit.sc.di.stats.domain.TeamDetails;
import com.careerit.sc.di.stats.dto.PlayerDto;
import com.careerit.sc.di.stats.dto.TeamStatsDto;
import com.careerit.sc.di.stats.util.JsonReaderUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IplStatServiceImpl implements IplStatService {

  private final JsonReaderUtil jsonReaderUtil;
  private List<TeamDetails> teamDetailsList=new ArrayList<>();
  private List<Player> playerList=new ArrayList<>();

  @PostConstruct
  public void init() {
    TypeReference<List<TeamDetails>> teamType = new TypeReference<List<TeamDetails>>() {
    };
    teamDetailsList.addAll(jsonReaderUtil.loadFromJson("/team.json", teamType));
    TypeReference<List<Player>> playerType = new TypeReference<List<Player>>() {
    };
    playerList.addAll(jsonReaderUtil.loadFromJson("/player.json", playerType));
    System.out.println("Team count   :" + teamDetailsList.size());
    System.out.println("Player count :" + playerList.size());
  }
  @PreDestroy
  public void clear(){
        teamDetailsList.clear();
        playerList.clear();
  }
  @Override
  public List<TeamStatsDto> getTeamStats() {
    return null;
  }

  @Override
  public List<PlayerDto> getMaxPaidPlayers() {
    return null;
  }

  @Override
  public List<PlayerDto> getMaxPaidPlayers(String teamName) {
    return null;
  }
}
