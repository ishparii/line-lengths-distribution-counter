package edu.luc.etl.osdi.processtree.scala
package immutable


/** A main app that combines the common code with the mutable implementation. */
object Main extends common.Main with ImmutableLengthsDistributionRecorder

/**
 * An immutable (purely functional) implementation of a lengths distribution recorder
 */
trait ImmutableLengthsDistributionRecorder extends common.LengthsDistributionRecorder {

  override def recordLengths(lines: Iterator[String]): Map[Int, Int] = {
    lines.toSeq.map(_.length).groupBy(identity).mapValues(_.length)
  }
}
