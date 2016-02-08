package edu.luc.etl.osdi.processtree.scala
package common

import java.io.{BufferedWriter, StringWriter}

import org.scalatest.WordSpec

/** Tests for the `printLengthsDistribution` method. */
class PrintSpec extends WordSpec with IO {

  def fixture() = new {
    val stringWriter = new StringWriter
    implicit val strout = new BufferedWriter(stringWriter, IO_BUF_SIZE)
  }

  "The string writer" when {
    "when used through a buffered writer" should {
      "return the output as a string" in {
        val f = fixture()
        f.strout.append("asdf")
        f.strout.flush()
        assert(f.stringWriter.toString == "asdf")
      }
    }
  }

  "The lengths distribution printer" when {
    "given an empty map" should {
      "print this map correctly" in {
        val f = fixture()
        printLengthsDistribution(LengthDistributionFixtures.empty)(f.strout)
        assert(f.stringWriter.toString == "* 0")
      }
    }

    "given a simple map" should {
      "print this map correctly" in {
        val f = fixture()
        printLengthsDistribution(LengthDistributionFixtures.simple)(f.strout)
        assert(f.stringWriter.toString ==  """0 2 **
                                             |*    2""".stripMargin)
      }
    }

    "given a complex map" should {
      "print this map correctly" in {
        val f = fixture()
        printLengthsDistribution(LengthDistributionFixtures.complex)(f.strout)
        assert(f.stringWriter.toString ==
          """|0   2 **
             |1      0
             |2    1 *
             |3      0
             |4      0
             |5 4 ****
             |*      7""".stripMargin)
      }
    }
  }
}
