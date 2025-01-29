package com.tech.engg5.vault.advanced.utility;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

  String name;
  String location;
  double salary;
}
