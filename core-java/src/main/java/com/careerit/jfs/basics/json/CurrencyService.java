package com.careerit.jfs.basics.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.MapUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CurrencyService {

  Map<String,CurrencyDetails> map = null;
  public CurrencyService() {
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      TypeReference<Map<String,CurrencyDetails>> type = new TypeReference<Map<String, CurrencyDetails>>(){};
      map = objectMapper.readValue(CurrencyService.class.getResourceAsStream("/currency_details.json"), type);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  public CurrencyDetails findByCurrencyCode(String code) {
     if(MapUtils.isNotEmpty(map)){
      return Optional.ofNullable(map.get(code)).orElseThrow(()->new IllegalArgumentException("Currency code is not found "+code));
    }
    throw new IllegalArgumentException("Currency code is not found");
  }
}
