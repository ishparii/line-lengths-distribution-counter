package edu.luc.etl.osdi.processtree.scala
package immutable


/** A main app that combines the common code with the mutable implementation. */
object Main extends common.Main with ImmutableLengthsDistributionRecorder

/**
 * An immutable (purely functional) implementation of a process tree builder
 * based on `foldLeft`. This is more space-efficient than groupBy because
 * it can work directly on consecutive items of the iterator.
 */
trait ImmutableLengthsDistributionRecorder extends common.LengthsDistributionRecorder {

  override def recordLengths(lines: Iterator[String]): Map[Int, Int] = {
    lines.toSeq.map(_.length).groupBy(identity).mapValues(_.length)

  }
}
