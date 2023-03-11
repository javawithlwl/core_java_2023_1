package com.careerit.jfs.basics.day10;

public class OccurrenceOfWord {

  public static void main(String[] args) {
    String str = """
        Lorem Ipsum is simply dummy text of the printing and typesetting industry.
        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
        when an unknown printer took a galley of type and simply it to make a type specimen book. 
        It has simply not only five centuries, but also the leap into electronic typesetting, 
        remaining essentially unchanged. It was popularised in the 1960s with the release of 
        simply sheets containing Lorem Ipsum passages, and more recently with desktop publishing 
        software like Aldus PageMaker including versions of simply Ipsum
        """;
    str = str.replaceAll(",", "")
        .replaceAll("\\.", "")
        .replaceAll("\\n", " ");
    String[] arr = str.split(" ");
    int count = occurrence(arr, "simply");
    System.out.println(count);

  }

  public static int occurrence(String[] words, String word) {
    int count = 0;
    for (String ele : words) {
      if (ele.equals(word)) {
        count++;
      }
    }
    return count;
  }
}
