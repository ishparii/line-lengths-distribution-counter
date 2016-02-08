package edu.luc.etl.osdi.processtree.scala
package mutable

/** A main app that combines the common code with the mutable implementation. */
object Main extends common.Main with MutableLengthsDistributionRecorder

/** A mutable (imperative) implementation of a lengths distribution recorder. */
trait MutableLengthsDistributionRecorder extends common.LengthsDistributionRecorder {

  import scala.collection.mutable.HashMap

  override def recordLengths(lines: Iterator[String]): Map[Int,Int] = {
    val lengthsDistributionMap = new HashMap[Int, Int]

    while (lines.hasNext) {
      val length = lines.next().length()
      if (lengthsDistributionMap.contains(length)) {
        lengthsDistributionMap(length) += 1
      } else {
        lengthsDistributionMap(length) = 1
      }
    }

    return lengthsDistributionMap.toMap

  }
}
