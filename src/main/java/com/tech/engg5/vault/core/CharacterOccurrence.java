package com.tech.engg5.vault.core;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
  public static void main(String[] args) {
    String inputString = "development";

    Map<Character, Long> charCountMp = inputString.chars()
      .mapToObj(c -> (char) c)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    charCountMp.forEach((character, count) -> System.out.println(character + ": " + count));
  }
}
