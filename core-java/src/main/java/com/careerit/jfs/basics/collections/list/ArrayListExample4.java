package com.careerit.jfs.basics.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExample4 {


  public static void main(String[] args) {
    int n = 100;
    List<Integer> list = IntStream.rangeClosed(1,n).boxed().collect(Collectors.toList());

    // Can you get numbers which are divisible 3 but not with 6

    List<Integer> filteredData = new ArrayList<>();
    for(Integer ele:list){
        if(ele % 3 == 0 && ele % 6 != 0){
            filteredData.add(ele);
        }
    }
    System.out.println(filteredData);
    List<Integer> flist = list.stream()
                              .filter((ele)-> ele % 3 == 0 && ele % 6 != 0)
                              .collect(Collectors.toList());

    // Get all prime numbers
    List<Integer> primeList = new ArrayList<>();
    for(Integer ele:list){
        if(isPrime(ele)){
            primeList.add(ele);
        }
    }
    System.out.println(primeList);

    List<Integer> plist = list.stream().filter((ele) -> isPrime(ele)).collect(Collectors.toList());

    // Double each element

    List<Integer> dlist = list.stream().map(ele -> ele * ele).collect(Collectors.toList());

    List<String> usernames = List.of("Naresh","Rajesh","Rama Krishna","Suresh Babu");

    List<Integer> nameLengthList = usernames.stream()
            .map(ele->ele.length()).collect(Collectors.toList());
    System.out.println(nameLengthList);



  }
  private static boolean isPrime(int num){
      if(num < 2 || (num%2==0 && num!=2)){
        return false;
      }
      for(int i=2;i<=num/2;i++){
        if(num % i == 0){
          return false;
        }
      }
      return true;
  }

}
