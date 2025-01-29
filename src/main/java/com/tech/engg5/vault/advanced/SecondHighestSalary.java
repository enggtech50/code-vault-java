package com.tech.engg5.vault.advanced;

import com.tech.engg5.vault.advanced.utility.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
  public static void main(String[] args) {

    List<Employee> employees = Arrays.asList(
      new Employee("Alice", "London", 1000),
      new Employee("Bob", "USA", 1500),
      new Employee("John", "Ireland", 1600),
      new Employee("Harry", "USA", 1200),
      new Employee("Diana", "USA", 1500));

    try {
      double secondHighestSalary = getSecondHighestSalary(employees);
      System.out.println("Second Highest Salary - " + secondHighestSalary);
    } catch (Exception exc) {
      exc.printStackTrace();
    }
  }

  public static double getSecondHighestSalary(List<Employee> employees) {
    // Check if there are enough employees to have a second-highest salary
    if (employees == null || employees.size() < 2) {
      throw new IllegalArgumentException("Not enough employees to find the second highest salary.");
    }

    // Get distinct salaries and sort them in descending order
    List<Double> result = employees.stream()
      .map(Employee::getSalary)
      .distinct()
      .sorted(Comparator.reverseOrder()).toList();

    // Check if there are at least three unique salaries
    if (result.size() < 2) {
      throw new IllegalArgumentException("Not enough distinct salaries to find the third highest.");
    }

    // Return the second-highest salary
    return result.get(1);
  }
}
