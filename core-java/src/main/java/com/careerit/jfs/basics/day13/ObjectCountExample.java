package com.careerit.jfs.basics.day13;

class HomePage{

    private static int count=0;
    public HomePage(){
        count +=1;
    }
    public static void showCount(){
      System.out.println(count);
    }

}
public class ObjectCountExample {
  public static void main(String[] args) {
    HomePage.showCount();
    HomePage user1 = new HomePage();
    HomePage user2 = new HomePage();
    HomePage user3 = new HomePage();
    HomePage.showCount();
  }
}
