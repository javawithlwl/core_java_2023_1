package com.careerit.jfs.basics.day19;

 abstract class Game{
    public void start(){
      System.out.println("The Game "+this.getClass().getSimpleName()+" is going to start");
    }
    public abstract void play();
    public void stop(){
      System.out.println("The Game "+this.getClass().getSimpleName()+" is going stop");
    }
}
class Bike extends  Game{
  @Override
  public void play() {
    System.out.println("You are playing "+this.getClass().getSimpleName()+" Game, please wear helmet");
  }
}
class Car extends  Game{
  @Override
  public void play() {
    System.out.println("You are playing "+this.getClass().getSimpleName()+" Game, please wear seat belt");
  }
}
class Ship extends  Game{
  @Override
  public void play() {
    System.out.println("You are playing "+this.getClass().getSimpleName()+" Game, please wear water jacket");
  }
}
// Bike, Car, Ship

public class GameManager {

  public static void main(String[] args) {

          Game game = new Car();
          game.start();
          game.play();
          game.stop();

  }
}
