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
  val printing1 = println("This is an instruction")
  // The above and below returns a "unit". An expression that
  //    returns a unit doesn't return a value but it does something.
  // In other words, in Scala, an instruction is a structure (like
  //    the thing below) that returns a unit
  val printing2: Unit = println("This is another instruction")
  // Units have a value which is "()". Every expression returning
  //    unit, returns this token.
  // If you compare two expressions that return unit, regardless of
  //    what they're doing, it'll return true.
  val theUnit: Unit = ()

  // Instructions, in Code Block form, can also return Unit
  val aCodeBlock = {
    val aLocalValue = 45
    println("Instruction 1")
    println("Instruction 2")
  }

  // Variables in Scala. Values can't be reassigned but
  //    variables can!
  var aVariable = 10
  aVariable = 34

  // Variable Reassignment also return unit and can be assigned
  //    as such.
  // The act of reassignment won't return anything valuable but,
  //    this assignment (because it's saved to a value), still
  //    produces the effect of changing the memory zone.
  val reassignment: Unit = aVariable += 1
  val printing3: Unit = println(aVariable)



  def main(args: Array[String]): Unit = {
    println(printing1 == theUnit)
    // Loops in Scala
    var theNumber = 1
    while (theNumber <= 10) {
      println(theNumber)
      theNumber += 1
    }
  }
}
