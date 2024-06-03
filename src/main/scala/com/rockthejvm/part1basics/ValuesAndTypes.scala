package com.rockthejvm.part1basics

object ValuesAndTypes {

  // Declare a "constant" with the keyword: "val" then "[nameOfVar]:"
  //   Following that, fill in the correct data type and assign a value
  //   [declaration] [nameOfVar]: [DataType] = [Value]
  val meaningOfLife: Int = 42
  // Similar to other languages, i.e., const int meaningOfLife=42;
  // NOTE: Constants or "vals" cannot be reassigned

  // Type Inference: Somewhat similar to python, Scala compiler will
  //    automatically infer a data type.
  val anInteger1 = 67

  //Common Types
  //BOOLEAN
  val aBoolean: Boolean = false // or "true"
  //CHAR
  val aChar: Char = 'a'
  //INT
  val anInt: Int = 45 // 4 Bytes
  //SHORT
  val aShort: Short = 5243 // 2 Byte Integer
  //LONG - Requires an "L" at the end
  val aLong: Long = 5461684654L // 8 Byte Integer
  //FLOAT - Requires a "s" at the end
  val aFloat: Float = 2.4f // 4 Byte (Decimal)
  //DOUBLE
  val aDouble: Double = 3.14 //8 Byte Decimal

  // String Types - MUST USE DOUBLE QUOTES
  val aString: String = "Scala is wack"



  //Any object with a "main" function can be compiled
  //  and ran on its own
  def main(args: Array[String]): Unit = {

  }
}
