package com.careerit.jfs.basics.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TransactionService {

  List<Transaction> list = null;
  private CurrencyService currencyService = new CurrencyService();

  public TransactionService() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    try {
      TypeReference<List<Transaction>> type = new TypeReference<>() {
      };
      list = objectMapper.readValue(CurrencyService.class.getResourceAsStream("/transactions.json"), type);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public List<TransactionDto> getTransactionDetails() {
    List<TransactionDto> txnList = new ArrayList<>();
    for (Transaction transaction : list) {
      CurrencyDetails currencyDetails=null;
      try {
        currencyDetails = currencyService.findByCurrencyCode(transaction.getCurrency());
      }catch (Exception e){
        System.out.println(e.getMessage());
      }
      TransactionDto transactionDto = new TransactionDto();
      transactionDto.setId(transaction.getId());
      transactionDto.setName(transaction.getFullName());
      transactionDto.setDate(transaction.getDate());
      if(currencyDetails!=null) {
        transactionDto.setAmount(currencyDetails.getSymbol() + "" + transaction.getAmount());
      }else{
        transactionDto.setAmount(""+transaction.getAmount());
      }
      txnList.add(transactionDto);
    }
    return txnList;
  }
}
