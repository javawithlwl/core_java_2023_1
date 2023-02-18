package com.careerit.jfs.basics.collections.list;

import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Country {
  String countryCode;
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Currency {
  String countryCode;
  String symbol;
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class CountryCurrencyDTO {
  String countryCode;
  String currencySymbol;
}

public class ArrayListExample3 {


  public static void main(String[] args) {

    List<Country> countryList = new ArrayList<>();
    countryList.add(new Country("USA"));
    countryList.add(new Country("IN"));
    countryList.add(new Country("CAD"));

    List<Currency> currencyList = new ArrayList<>();
    currencyList.add(new Currency("USA", "$"));
    currencyList.add(new Currency("IN", "Rs"));
    currencyList.add(new Currency("CAD", "CA$"));

    List<CountryCurrencyDTO> list = new ArrayList<>();
    for(Country country:countryList){
          Currency currency = getCurrency(currencyList,country.getCountryCode());
          CountryCurrencyDTO obj = new CountryCurrencyDTO();
          obj.setCountryCode(country.getCountryCode());
          obj.setCurrencySymbol(currency.getSymbol());
          list.add(obj);

    }
    System.out.println(list);

  }

  public static Currency getCurrency(List<Currency> list, String countryCode) {
    for (Currency currency : list) {
      if (StringUtils.equals(currency.getCountryCode(), countryCode)) {
        return currency;
      }
    }
    throw new IllegalArgumentException("Unsupported currency");
  }

}
