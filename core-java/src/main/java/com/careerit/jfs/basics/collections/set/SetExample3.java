package com.careerit.jfs.basics.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample3 {

  public static void main(String[] args) {

    List<Integer> cricket = List.of(1001,1002,1003,1004,1005);
    List<Integer> badminton = List.of(1001,1002,1009,1007,1008);
    List<Integer> football = List.of(1001,1006,1003,1010,1005);

    Set<Integer> set = new HashSet<>();
    set.addAll(cricket);
    set.addAll(badminton);
    set.addAll(football);
    System.out.println(set);

    for(Integer player:set){
        if(cricket.contains(player) && badminton.contains(player) && football.contains(player)){
          System.out.println(player);
        }
    }


  }
}
