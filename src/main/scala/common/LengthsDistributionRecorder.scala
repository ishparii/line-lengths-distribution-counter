package edu.luc.etl.osdi.processtree.scala.common

/**
 * template for both mutable and immutable implementations
 */
trait LengthsDistributionRecorder {
  def recordLengths(lines: Iterator[String]): Map[Int, Int]
}
