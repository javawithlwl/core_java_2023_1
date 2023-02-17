package com.careerit.jfs.basics.collections;

import com.careerit.jfs.basics.day17.one.C;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Country {
  String code;
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
class CountryCurrencyDTO{
    String countryName;
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

    // show country and currency details
  }
}
