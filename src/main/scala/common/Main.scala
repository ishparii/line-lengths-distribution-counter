package edu.luc.etl.osdi.processtree.scala.common

/** The common main method for the console applications. */
trait Main extends App with IO with LengthsDistributionRecorder {

    val lines: Iterator[java.lang.String] = scala.io.Source.stdin.getLines
    val lengthsDistribution: Map[Int, Int] = recordLengths(lines)

    printLengthsDistribution(lengthsDistribution)

}
