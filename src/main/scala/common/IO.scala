package edu.luc.etl.osdi.processtree.scala.common

import java.io.{BufferedWriter, OutputStreamWriter}

import scala.collection.JavaConversions.enumerationAsScalaIterator
import scala.math.max

/** I/O methods for the console applications. */
trait IO {

  /** The buffer size for the output writer. */
  val IO_BUF_SIZE = 8192

  /** A buffered output writer for efficiency. */
  implicit val stdout = new BufferedWriter(new OutputStreamWriter(System.out), IO_BUF_SIZE)

  /** Prints a map representing a process tree. */
  def printLengthsDistribution(lengthsDistribution: Map[Int, Int])(implicit out: BufferedWriter): Unit = {
    if (lengthsDistribution.nonEmpty) {
      val maxLength = lengthsDistribution.keysIterator.max
      val numOfLines = lengthsDistribution.foldLeft(0)(_+_._2)
      val indent = lengthsDistribution.valuesIterator.max

      for (i <- 0 to maxLength) {
        out.append(i + " ")
        if (lengthsDistribution.contains(i)) {
          out.append(" " * (indent - lengthsDistribution(i)))
          out.append(lengthsDistribution(i) + " " + "*" * lengthsDistribution(i))
        } else out.append(" " * indent + " 0")
        out.newLine()
      }

      out.append("*" + " " * (indent + 2) + numOfLines)

    } else out.append("* 0")

    out.flush()
  }

}
