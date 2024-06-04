package com.rockthejvm.part1basics

object Expressions {

  // Definition: Expressions are structures that evaluate to a
  //    value.
  // Common Expressions:
  //    (+, -, *, /, bitwise, |, &, >>, <<)


  // Mathematical Expressions
  val mathExp = 2 + 3 * 4
  val meaningOfLife = 40 + 2
  //                  ^^^^^^ <- Expression

  // Boolean Expressions - Returns true or false
  val equalityTest = 1 > 2

  // If Statements & Expressions
  //    Here, if the boolean value is true, return 45.
  //          if the boolean value is false, return 99
  val anIfExpression = if (equalityTest) 45 else 99
  val anIfExpression2 = if equalityTest then 45 else 99

  // Code Blocks - Contained expressions where the last
  //    executed statement is the return value assigned to
  //    the variable name. In this case, aCodeBlock = 177
  val aCodeBlock = {
    // Define local values
    val localValue = 78
    // other statements....
    localValue + 99
  }

  // Code Blocks using indentation
  val aCodeBlock2 =
    val localValue = 78
    localValue + 99

  // Pattern Matching - "Switch on steroids"
  val someValue = 42
  // Assign the result of Pattern Matching to some variable
  val description = someValue match {
    //              ^^^^^^^^^ Value being compared
    case 1 => "first"
    //         ^^^^^  if "1" is a match, return "first"
    case 2 => "second"
    //         ^^^^^^ if "2" is a match, return "second"
    case 42 => "meaning of life"
    case _ => "None of the Above"
    // If no match is found, return "None of the Above"

  }

  def main(args: Array[String]): Unit = {
    println(meaningOfLife)
    println(mathExp)
    println(equalityTest)

    println(anIfExpression)
    //Expressions can be evaluated directly in the println
    //  as well
    println(if (equalityTest) 45 else 99)

    println(aCodeBlock)
    // Code Blocks can also be evaluated directly
    println({val localValue = 78
      localValue + 99})
    // Indented CodeBlocks
    println(aCodeBlock2)
    println(description)
  }

}
