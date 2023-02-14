package com.careerit.jfs.basics.interfaceex;

import java.util.concurrent.ThreadLocalRandom;

interface Game {
  void play();
}

class Bike implements Game {

  public void play() {
    System.out.println("Bike");
  }
}

class Car implements Game {
  public void play() {
    System.out.println("Car");
  }

  public void fly() {
    System.out.println("Car Can Fly");
  }
}

class Ship implements Game {
  public void play() {
    System.out.println("Ship");
  }
}

class GameUtil {
  public static Game randomGame() {
    int num = ThreadLocalRandom.current().nextInt(1, 4);
    return switch (num) {
      case 1 -> new Bike();
      case 2 -> new Car();
      case 3 -> new Ship();
      default -> throw new IllegalArgumentException("Invalid game type");
    };

  }
}

class CC1{
    void m1(){
      System.out.println("M1");
    }
}
class CC2 extends  CC1{
    void m2(){
      System.out.println("M2");
    }
}

public class GameManager {

  public static void main(String[] args) {
    Game game = GameUtil.randomGame();
    if(game instanceof  Car car){
      car.play();
      car.fly();
    }else{
        game.play();
    }
  }
}

