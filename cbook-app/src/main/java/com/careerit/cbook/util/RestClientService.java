package com.careerit.cbook.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class RestClientService {


  public static void main(String[] args) {
    try {
      HttpClient httpClient = HttpClient.newBuilder().build();
      HttpRequest request = HttpRequest.newBuilder().GET().uri(new URI("https://restcountries.com/v3.1/all")).build();
      HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
      String apiResponse = response.body();
      ObjectMapper objectMapper = new ObjectMapper();
      Object[] arr= objectMapper.readValue(apiResponse,Object[].class);
      int i = 0;
      for(Object obj:arr){
        TypeReference<Map<String,Object>> type = new TypeReference<Map<String,Object>>() {};
        Map<String,Object> ret= objectMapper.readValue(objectMapper.writeValueAsString(obj),type);
        System.out.println(ret);
        System.out.println(ret.get("name"));
        System.out.println(ret.get("currencies"));
        System.out.println(ret.get("flags"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
