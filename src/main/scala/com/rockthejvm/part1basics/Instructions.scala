package com.rockthejvm.part1basics

object Instructions {


  // Instructions vs. Expressions
  //  "Imperative Programming"
  //    - task1, task2, repeat(10) {...}
  //    - We tell the computer what to do, step by step
  //  "Functional Programming"
  //    - 2 + 3, I/O effects, map, flatMap, filter
  //    - Here, expressions are evaluated

  // Instructions in Scala:
  // "Printing as an assignment to a variable"
  //    (Even if there's nothing in main, this will
  //    still execute because it occurs during the
  //    assignment stage)
  val printing = println("This is an instruction")
  //

  def main(args: Array[String]): Unit = {

  }
}
