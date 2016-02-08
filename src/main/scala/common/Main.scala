package edu.luc.etl.osdi.processtree.scala.common

/** The common main method for the console applications. */
trait Main extends App with IO with LengthsDistributionRecorder {

    val lines: Iterator[java.lang.String] = scala.io.Source.stdin.getLines
    val lengthsDistribution: Map[Int, Int] = recordLengths(lines)
    //val header = lines.next()
    //val parse = parseLine(header)
    //val processes = lines map parse

//    val start = System.currentTimeMillis
//    val processTree = recordLengths()
//    val total = System.currentTimeMillis - start

    printLengthsDistribution(lengthsDistribution)
    //println("processing time: " + total + " ms")

}
