package edu.luc.etl.osdi.processtree.scala
package common

/** Common fixtures across tests. */
object LengthDistributionFixtures {

  val empty = Map.empty[Int, Int]

  val simple = Map(0 -> 2)

  val complex = Map(
    0 -> 2,
    2 -> 1,
    5 -> 4
  )
}
