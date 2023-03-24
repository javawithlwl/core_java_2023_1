package com.careerit.sc.di.stats.service;

import com.careerit.sc.di.stats.dto.PlayerDto;
import com.careerit.sc.di.stats.dto.TeamStatsDto;

import java.util.List;

public interface IplStatService {

      List<TeamStatsDto> getTeamStats();
      List<PlayerDto> getMaxPaidPlayers();
      List<PlayerDto> getMaxPaidPlayers(String teamName);

}
