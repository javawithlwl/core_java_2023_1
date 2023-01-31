package com.careerit.jfs.basics.day10;

public class EmailTemplateExample {

  public static void main(String[] args) {

    String name = "Manoj";
    int age = 35;
    String email = "manoj.pvn@gmail.com";
    double salary = 180000;
    String data = String.format("%s,%s,%s,%s", name, age, email, salary);
    System.out.println(data);
    sendEmail(new String[]{"Krish", "Manoj", "John", "Murali"}, "Java Fullstack");

  }

  public static void sendEmail(String[] users, String programName) {

    for (String username : users) {
      StringBuilder str = new StringBuilder("<!DOCTYPE html>");
      str.append("\n<html lang=\"en\">");
      str.append("\n\t<head>");
      str.append("\n\t\t<title>Sample HTML</title>");
      str.append("\n\t</head>");
      str.append("\n<body>");
      str.append(String.format("\n\t<h3>Hello %s </h3>", username));
      str.append("\n\t<p>");
      str.append("\n\t\t".concat(String.format("Welcome to %s", programName)));
      str.append("\n\t</p>");
      str.append("\n</body>");
      str.append("\n</html>");
      System.out.println("*".repeat(100));
      System.out.println(str);

    }


  }
}
